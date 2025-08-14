package com.example.simpleWebApp.controller;

import com.example.simpleWebApp.model.Product;
import com.example.simpleWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

  @Autowired ProductService productService;

  @GetMapping("/products")
  public List<Product> getProducts() {
    return productService.getProducts();
  }

  @GetMapping("/products/{productId}")
  public Product getProductById(@PathVariable int productId) {
    return productService.getProductById(productId);
  }

  @PostMapping("/product")
  public void addProduct(@RequestBody Product product) {
    productService.addProduct(product);
  }

  @PutMapping("/product")
  public void updateProduct(@RequestBody Product product) {
    productService.updateProduct(product);
  }

  @DeleteMapping("/products/{productId}")
  public void deleteProductById(@PathVariable int productId) {
    productService.deleteProductById(productId);
  }
}
