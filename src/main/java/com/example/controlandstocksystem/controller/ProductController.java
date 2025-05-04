package com.example.controlandstocksystem.controller;

import org.springframework.web.bind.annotation.*;

import com.example.controlandstocksystem.model.Product;
import com.example.controlandstocksystem.service.ProductService;

import java.util.List;

@RestController
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return productService.productsReturn();
    }

    @PostMapping("/products")
    public void addNewProduct(@RequestBody Product product){
        productService.addProduct(product);
    }

    @PatchMapping("/products/{id}")
    public void updateProduct(@PathVariable int id, @RequestBody Product newProduct){
        productService.updateProduct(id,newProduct);
    }

    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable int id){
        productService.deleteProduct(id);
    }

    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable int id){
        return productService.getProductById(id);
    }
    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }
}
