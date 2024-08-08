package com.scaler.productservice_backend.services;

import com.scaler.productservice_backend.models.Product;

import java.util.List;

public interface productService {
    Product getSingleProduct(long productId);
    List<Product> getAllProducts();
}
