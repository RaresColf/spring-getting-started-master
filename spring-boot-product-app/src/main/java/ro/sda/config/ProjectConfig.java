package ro.sda.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@Slf4j
public class ProjectConfig {
    @Value("${spring.datasource.url}")
    private String dataSourceURL;

    @Value("${spring.datasource.driver-class-name}")
    private String dataSourceDriver;

    @Value("${spring.datasource.username}")
    private String dataSourceUsername;

    @Value("${spring.datasource.password}")
    private String dataSourcePassword;


    @PostConstruct
    public void print() {
        log.info("dataSourceURL {}", dataSourceURL);
        log.info("dataSourceDriver {}", dataSourceDriver);
        log.info("dataSourceUsername {}", dataSourceUsername);
        log.info("dataSourcePassword {}", dataSourcePassword);
    }

    @Bean
    public DataSource dataSource() {
        var dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(dataSourceDriver);
        dataSource.setUrl(dataSourceURL);
        dataSource.setUsername(dataSourceUsername);
        dataSource.setPassword(dataSourcePassword);
        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }



}
