package com.laurentiuspilca.springtesting.controllers;

import com.laurentiuspilca.springtesting.models.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping(path = "/product/{name}")
    public Product getProduct(@PathVariable String name) {
        return new Product(name, 10D);
    }
}
