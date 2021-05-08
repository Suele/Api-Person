package com.example.myFirstProject.resources;

import com.example.myFirstProject.entities.Category;
import com.example.myFirstProject.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping
    public List<Category> listCategory () {
        return categoryRepository.findAll();
    }

    @GetMapping(value = "/{id}")
    public Category changeId (@PathVariable Long id) {
        return categoryRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Category createCategory (@RequestBody Category category) {
        return categoryRepository.save(category);
    }


}
