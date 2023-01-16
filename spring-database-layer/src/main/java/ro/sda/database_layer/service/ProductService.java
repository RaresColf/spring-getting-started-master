package ro.sda.database_layer.service;


import org.springframework.stereotype.Service;
import ro.sda.database_layer.model.Product;
import ro.sda.database_layer.repository.ProductRepository;

import java.util.List;

@Service
public class ProductService {

    int counter = 0;

    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void addProduct(Product p) {
        productRepository.addProduct(p.getName());
    }

    public List<Product> getAllProducts() {
        return productRepository.getAllProducts();
    }

    public void addProductExWithoutTx(List<Product> productList){
        productRepository.addProductsExceptionWithoutTransaction(productList);
    }

    public void addProductTransactional(List<Product> productList){
        productRepository.addProductsTransactional(productList);
    }



}
