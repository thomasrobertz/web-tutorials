package com.laurentiuspilca.springdata.controllers;

import com.laurentiuspilca.springdata.entities.Product;
import com.laurentiuspilca.springdata.repositories.ProductPagedRepository;
import com.laurentiuspilca.springdata.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductPagedRepository repository;

    @PostMapping(path = "/add")
    public void addProduct(@RequestBody Product p) {
        repository.save(p);
    }

    @GetMapping(path = "/get/{name}")
    public Product getProduct(@PathVariable String name) {
        return repository.findProductByName(name);
    }

    @GetMapping(path = "/sort")
    public Iterable<Product> getAllSortedDescendingById() {
        return repository.findAll(Sort.by("id").descending());
    }
}
