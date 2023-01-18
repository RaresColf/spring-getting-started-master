package ro.sda.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ro.sda.model.Product;
import ro.sda.service.ProductService;

import java.util.List;

@RestController
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/product/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void addProduct(@RequestBody Product p) {
        productService.addProduct(p);
    }
    @GetMapping("/product/all")
    public List<Product> getAllProducts(){
       return productService.getAllProducts();
    }
}
