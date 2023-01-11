package ro.sda.helloapp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "ro.sda.helloapp.services.impl")
public class ProjectConfig {
}
