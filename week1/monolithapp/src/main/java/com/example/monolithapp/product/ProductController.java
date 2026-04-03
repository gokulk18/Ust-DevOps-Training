// src/main/java/com/example/monolithapp/product/ProductController.java

package com.example.monolithapp.product;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService service;

    // Constructor injection for ProductService
    public ProductController(ProductService service) {
        this.service = service;
    }

    // Endpoint to create a new product
    @PostMapping
    public Product create(@RequestBody Product product) {
        return service.save(product);
    }

    // Endpoint to get all products
    @GetMapping
    public List<Product> getAll() {
        return service.getAll();
    }

    // Endpoint to get a product by its ID
    @GetMapping("/{id}")
    public Product getById(@PathVariable Long id) {
        return service.getById(id);
    }
}