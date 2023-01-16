package ro.sda.database_layer;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.sda.database_layer.config.ProjectConfig;
import ro.sda.database_layer.model.Product;
import ro.sda.database_layer.service.ProductService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(ProjectConfig.class)){

            ProductService productService =  context.getBean(ProductService.class);
            productService.addProduct(new Product("product 1"));
            productService.addProduct(new Product("product 2"));
            productService.addProduct(new Product("product 3"));

            List<Product> results = productService.getAllProducts();
            System.out.println(results);


            try{
                productService.addProductExWithoutTx(List.of(new Product("milk"), new Product("bread"), new Product("eggs")));
            } catch(RuntimeException ex){
                System.out.println(ex);
            }
            List<Product> results2 = productService.getAllProducts();
            System.out.println(results2);



            try{
                productService.addProductTransactional(List.of(new Product("A"), new Product("B"), new Product("C")));
            } catch(RuntimeException ex){
                System.out.println(ex);
            }
            List<Product> results3 = productService.getAllProducts();
            System.out.println(results3);
        }




    }
}
