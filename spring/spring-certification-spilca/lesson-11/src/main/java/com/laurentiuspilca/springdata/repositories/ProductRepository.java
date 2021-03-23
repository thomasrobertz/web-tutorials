package com.laurentiuspilca.springdata.repositories;

import com.laurentiuspilca.springdata.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    public Product findProductByName(String name);
}
