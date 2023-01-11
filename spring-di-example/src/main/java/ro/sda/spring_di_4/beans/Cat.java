package ro.sda.spring_di_4.beans;

import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Cat {
    @Value("Jessie")
    private String name;

    @PostConstruct
    public void init() {
        System.out.println("Cat was created!");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Cat is destroying!");
    }
}
