package com.example.coupangapiserver.product.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(columnDefinition = "TEXT")
    private String description; // 에디터가 HTML로 상품 설명을 저장

    private int price;

    private double rating;

    private String category;

    public Product() {
    }

    public Product(String name, String description, int price, double rating, String category) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.rating = rating;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }

    public String getCategory() {
        return category;
    }
}
