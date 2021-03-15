package com.laurntiuspilca.springbootrest.model;

import javax.annotation.PreDestroy;

public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Cat about to be destroyed");
    }
}
