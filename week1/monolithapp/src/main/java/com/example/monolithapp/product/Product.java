// src/main/java/com/example/monolithapp/product/Product.java

package com.example.monolithapp.product;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;  // Name of the product
    private double price; // Price of the product
}