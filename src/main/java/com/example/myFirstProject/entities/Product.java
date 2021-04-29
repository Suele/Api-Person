package com.example.myFirstProject.entities;

import java.io.Serializable;

public class Product implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long id;
    private String name;
    private Double price;

    private Category category;

    public Product () {
    }

    public Product (Long id, String name, Double price, Category category) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Long getId () {
        return id;
    }

    public String getName () {
        return name;
    }

    public Double getPrice () {
        return price;
    }


    public Category getCategory () {
        return category;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (!id.equals(product.id)) return false;
        if (!name.equals(product.name)) return false;
        if (!price.equals(product.price)) return false;
        return category.equals(product.category);
    }

    @Override
    public int hashCode () {
        return id.hashCode();
    }
}
