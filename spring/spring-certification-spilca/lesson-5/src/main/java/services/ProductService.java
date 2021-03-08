package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import repositories.ProductRepository;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Transactional
    public void addProduct(String name, double price) {
        productRepository.addProduct(name, price);
        //throw new RuntimeException("A server did not respond in a timely manner.");
    }

    public void addTenProducts(String name, double price) {
        productRepository.addTenProducts(name, price);
    }
}
