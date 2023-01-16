package ro.sda.aop.example2.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"ro.sda.aop.example2.services","ro.sda.aop.example2.aspects"})
public class ProjectConfig {
}
