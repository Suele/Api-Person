package com.example.myFirstProject.repositories;

import com.example.myFirstProject.entities.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class ProductRepository {
    private Map<Long, Product> map = new HashMap<>();

    // salva uma categoria e não retorna nada.
    public void save (Product product) {
        map.put(product.getId(), product);
    }

    // retorna a categoria que pertence o id informado.
    public Product findById (Long id) {
        return map.get(id);
    }

    // retorna  todas as categorias.
    public List<Product> findAll () {
        return new ArrayList<Product>(map.values());
    }
}
