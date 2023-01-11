package ro.sda.spring_di_1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ro.sda.spring_di_1.beans.Cat;

@Configuration
@ComponentScan(basePackages = "ro.sda.spring_di.components")
public class ProjectConfig {

  @Bean
  public Cat cat() {
    return new Cat();
  }
}