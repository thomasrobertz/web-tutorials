package com.laurentiuspilca.springdatamongodb.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Document
public class Product {
    private String id;
    private String name;
    public Product() {
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
