package com.laurentiuspilca.springdatamongodb.constrollers;

import com.laurentiuspilca.springdatamongodb.model.Product;
import com.laurentiuspilca.springdatamongodb.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductRepository repository;

    @PostMapping("/add/{name}")
    public void addProduct(@PathVariable String name) {
        Product p = new Product();
        p.setName(name);
        repository.save(p);
    }

    @GetMapping(path = "/all")
    public List<Product> getAllProducts() {
        return repository.findAll();
    }
}
