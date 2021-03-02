package main;

import config.ProjectConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

public class Main {
    public static void main(String[] args) throws Exception {
        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfiguration.class)) {
            DataSource datasource = context.getBean(DataSource.class);
            System.out.println(datasource.getConnection());
        }
    }
}
