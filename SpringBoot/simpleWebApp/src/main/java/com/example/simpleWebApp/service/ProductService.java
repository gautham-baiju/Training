package com.example.simpleWebApp.service;

import com.example.simpleWebApp.model.Product;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter
@Service
public class ProductService {
  List<Product> products =
      new ArrayList<>(
          Arrays.asList(
              new Product(1, "iphone", 1000),
              new Product(2, "ipad", 2000),
              new Product(3, "macbook", 3000)));

  public Product getProductById(int productId) {
    return products.stream()
        .filter(p -> p.getProductId() == productId)
        .findFirst()
        .orElse(new Product(1000, "no item", 0));
  }

  public void addProduct(Product product) {
    products.add(product);
  }

  public void updateProduct(Product product) {
    int index = 0;
    for (Product p : products) {
      if (p.getProductId() == product.getProductId()) {
        index = products.indexOf(p);
        break;
      }
    }
    products.set(index, product);
  }

  public void deleteProductById(int productId) {
    int index = 0;
    for (Product p : products) {
      if (p.getProductId() == productId) {
        index = products.indexOf(p);
        break;
      }
    }
    products.remove(index);
  }
}
