package ro.sda.aop.example1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import ro.sda.aop.example1.aspects.MathServiceAspect;

@EnableAspectJAutoProxy
@Configuration
@ComponentScan(basePackages = "ro.sda.aop.example1.services")
public class ProjectConfig {
    @Bean
    public MathServiceAspect aspect(){
        return new MathServiceAspect();
    }
}
