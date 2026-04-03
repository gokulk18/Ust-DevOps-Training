// src/main/java/com/example/monolithapp/product/ProductRepository.java

package com.example.monolithapp.product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}