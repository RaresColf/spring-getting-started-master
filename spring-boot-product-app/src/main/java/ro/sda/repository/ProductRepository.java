package ro.sda.repository;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import ro.sda.model.Product;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


@Repository
@Slf4j
public class ProductRepository {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @PostConstruct
    public void initDatabse() {
        String sql = "CREATE TABLE IF NOT EXISTS product(id bigint auto_increment, name varchar(255), description varchar(255), price int, is_in_stock boolean)";
        jdbcTemplate.update(sql);
        log.info("database created");
    }

    @PreDestroy
    public void dropDatabase() {
        String sql = "DROP TABLE IF EXISTS product";
        jdbcTemplate.update(sql);
    }

    public void addProduct(String name, String description, int price, boolean isInStock) {
        String sql = "INSERT INTO product(name, description, price, is_in_stock) VALUES(?, ?, ?, ?)";
        jdbcTemplate.update(sql, name, description, price, isInStock);
        log.info("Product {} successfully inserted", name);
    }

    public List<Product> getAllProducts() {
        String sql = "SELECT * FROM product";
        return jdbcTemplate.query(sql, new ProductMapper());
    }


    static class ProductMapper implements RowMapper<Product> {

        @Override
        public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
            return new Product(rs.getInt("id"), rs.getString("name"), rs.getString("description"), rs.getInt("price"), rs.getBoolean("is_in_stock"));
        }
    }
}
