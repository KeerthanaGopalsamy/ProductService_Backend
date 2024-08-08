package com.scaler.productservice_backend.services;

import com.scaler.productservice_backend.models.Product;

import java.util.List;

public class fakeStoreProductService implements productService{
    @Override
    public Product getSingleProduct(long productId) {
        return null;
    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }
}
