package com.laurentiuspilca.springdata.controllers;

import com.laurentiuspilca.springdata.entities.Product;
import com.laurentiuspilca.springdata.repositories.ProductPagedRepository;
import com.laurentiuspilca.springdata.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public List<Product> getProductsByName(@PathVariable String name) {
        return repository.findProductByName(name, Sort.by("price").ascending());
    }

    @GetMapping(path = "/sort")
    public Iterable<Product> getAllSortedDescendingById() {
        return repository.findAll(Sort.by("id").descending());
    }

    @GetMapping(path = "/page/{page}")
    public List<Product> getProductByPage(@PathVariable int page) {
        return repository.findAll(PageRequest.of(page, 2, Sort.by("price").ascending())).toList();
    }
}