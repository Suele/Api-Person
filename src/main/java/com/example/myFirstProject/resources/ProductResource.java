package com.example.myFirstProject.resources;

import com.example.myFirstProject.entities.Product;
import com.example.myFirstProject.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public List<Product> listProduct () {
        return productRepository.findAll();
    }

    @GetMapping(value = "/{id}")
    public Product changeId (@PathVariable Long id) {
        return productRepository.findById(id).orElse(null);
    }

    @PostMapping
    public ResponseEntity<Product> createProduct (@RequestBody Product product) {
        return ResponseEntity.status(HttpStatus.CREATED).body(productRepository.save(product));
    }
}
