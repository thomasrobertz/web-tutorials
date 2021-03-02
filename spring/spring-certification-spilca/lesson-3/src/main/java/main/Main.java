package main;

import config.ProjectConfiguration;
import model.Product;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import repositories.ProductRepository;

import javax.sql.DataSource;

public class Main {
    public static void main(String[] args) throws Exception {
        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfiguration.class)) {

            ProductRepository repository = context.getBean(ProductRepository.class);

            Product product = new Product();
            product.setName("Beer");
            product.setPrice(10);

            repository.addProduct(product);
        }
    }
}
