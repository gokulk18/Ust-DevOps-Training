// src/main/java/com/example/monolithapp/product/ProductService.java

package com.example.monolithapp.product;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    // Save a new product to the database
    public Product save(Product product) {
        return repository.save(product);
    }

    // Get all products from the database
    public List<Product> getAll() {
        return repository.findAll();
    }

    // Get a product by ID
    public Product getById(Long id) {
        return repository.findById(id).orElse(null);
    }
}