package com.laurentiuspilca.springtesting.services;

import com.laurentiuspilca.springtesting.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<String> getProductNamesWithEvenNumberOfCharacters() {
        //return repository.getProductNames().stream().filter(n -> (n.length() & 1) == 0).collect(Collectors.toList());
        List<String> names = repository.getProductNames();
        List<String> result = new ArrayList<String>();
        for(String n : names) {
            if (n.length() % 2 == 0) {
                result.add(n);
            }
        }
        return result;
    }
}
