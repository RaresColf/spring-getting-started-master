package ro.sda.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.sda.model.Product;
import ro.sda.repository.ProductRepository;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;


    public void addProduct(Product product){
        productRepository.addProduct(product.getName(), product.getDescription(), product.getPrice(), product.isInStock());
    }

    public List<Product> getAllProducts(){
        return productRepository.getAllProducts();
    }

}
