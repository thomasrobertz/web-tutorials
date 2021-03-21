package com.spilca.simpleweb.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void addProduct(String name) {
        jdbcTemplate.update("INSERT INTO product VALUES (NULL, ?, 1)", name);
    }
}
