package com.example.myFirstProject.repositories;

import com.example.myFirstProject.entities.Category;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class CategoryRepository {

    private Map<Long, Category> map = new HashMap<>();

    // salva uma categoria e não retorna nada.
    public void save(Category category){
        map.put(category.getId(), category);
    }

    // retorna a categoria que pertence o id informado.
    public Category findById(Long id){
        return map.get(id);
    }

    // retorna  todas as categorias.
    public List<Category> findAll(){
        return new ArrayList<Category>(map.values());
    }
}
