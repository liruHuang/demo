package com.example.demo.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {
    @Autowired
    ProductRepository productRepository;

    @Autowired
    ProductService productService;

    @PostMapping("/add")
    public Product addProduct(){
        return productService.addProduct();
    };

    @GetMapping("/product")
    public List<Product> getproduct(){
        return productService.findAll();
    };

    @GetMapping("/product/{id}")
    public Product getproductById(@PathVariable int id){
        Optional<Product> optional = productService.getProductById(id);
        return optional.get();
    };
}
