package com.example.simpleWebApp.service;

import com.example.simpleWebApp.model.Product;
import com.example.simpleWebApp.repository.ProductRepo;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter
@Service
public class ProductService {

  @Autowired ProductRepo repo;

  //  List<Product> products =
  //      new ArrayList<>(
  //          Arrays.asList(
  //              new Product(1, "iphone", 1000),
  //              new Product(2, "ipad", 2000),
  //              new Product(3, "macbook", 3000)));

  public List<Product> getProducts() {
    return repo.findAll();
  }

  public Product getProductById(int productId) {
    return repo.findById(productId).orElse(new Product());
  }

  public void addProduct(Product product) {
    repo.save(product);
  }

  public void updateProduct(Product product) {
    repo.save(product);
  }

  public void deleteProductById(int productId) {
    repo.deleteById(productId);
  }
}
