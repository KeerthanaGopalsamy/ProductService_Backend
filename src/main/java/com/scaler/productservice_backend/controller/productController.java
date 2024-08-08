package com.scaler.productservice_backend.controller;

import com.scaler.productservice_backend.models.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class productController {
@GetMapping("/{id}")
//http://localhost:8080/products/10
    public Product getProductById(@PathVariable("id")long id)
    {
      return null;
    }
    public List<Product> getAllProducts()
    {
        return new ArrayList<Product>();
    }
}