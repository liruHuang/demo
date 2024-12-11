package com.example.demo.Product;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(name = "name", nullable = false)
    String name;
    @Column
    int stock;
    @Column
    int price;
    @Column
    String description;

    public Product(String name) {
        this.name = name;
    }
}
