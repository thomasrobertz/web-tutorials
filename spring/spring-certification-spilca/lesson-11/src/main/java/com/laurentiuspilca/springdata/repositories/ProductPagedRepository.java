package com.laurentiuspilca.springdata.repositories;

import com.laurentiuspilca.springdata.entities.Product;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface ProductPagedRepository extends PagingAndSortingRepository<Product, Integer> {
    public List<Product> findProductByName(String name, Sort sort);
}