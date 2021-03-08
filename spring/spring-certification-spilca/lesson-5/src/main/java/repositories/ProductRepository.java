package repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class ProductRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    //@Transactional(propagation = Propagation.REQUIRED)
    public void addProduct(String name, double price) {
        jdbcTemplate.update("INSERT INTO product VALUES(NULL, ?, ?)", name, price);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void addTenProducts(String name, double price) {
        IntStream.range(1, 10).forEach(i -> {
            addProduct(String.format("%s %d", name, i), price);
            if (i == 5) {
                throw new RuntimeException("A server did not respond in a timely manner.");
            }
        });
    }
}
