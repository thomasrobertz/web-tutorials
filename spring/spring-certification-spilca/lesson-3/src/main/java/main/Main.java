package main;

import config.ProjectConfiguration;
import model.Person;
import model.Product;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import repositories.ProductRepository;

import javax.sql.DataSource;

public class Main {
    public static void main(String[] args) throws Exception {
        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfiguration.class)) {

            Person p = context.getBean(Person.class);

            /*
            ProductRepository repository = context.getBean(ProductRepository.class);
            repository.getProducts().forEach(p -> System.out.println("Product: "+ p.getName() + " " + p.getPrice()));

            product.setName("Beer");
            product.setPrice(10);

            repository.addProduct(product);
            */
        }
    }
}
