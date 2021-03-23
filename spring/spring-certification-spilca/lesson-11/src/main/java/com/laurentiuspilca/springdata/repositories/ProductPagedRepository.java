package com.laurentiuspilca.springdata.repositories;

import com.laurentiuspilca.springdata.entities.Product;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProductPagedRepository extends PagingAndSortingRepository<Product, Integer> {
    public Product findProductByName(String name);
}
