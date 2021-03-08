package repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class ProductRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void addProduct(String name, double price) {
        jdbcTemplate.update("INSERT INTO product VALUES(NULL, ?, ?)", name, price);
        throw new RuntimeException("A server did not respond in a timely manner.");
    }
}
