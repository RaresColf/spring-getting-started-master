package ro.sda.spring_di_4.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import ro.sda.spring_di_4.beans.Cat;

@Configuration
@ComponentScan(basePackages = "ro.sda.spring_di_4.beans")
public class ProjectConfig {

    @Bean
    //    @Scope(value = "prototype")
    public Cat cat() {
        return new Cat();
    }
}
