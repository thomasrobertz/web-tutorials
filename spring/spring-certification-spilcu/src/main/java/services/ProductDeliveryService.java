package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.ProductRepository;

@Service
public class ProductDeliveryService {

    @Autowired
    private ProductRepository productRepository;

    public void addProduct() {
        productRepository.add();
    }
}
