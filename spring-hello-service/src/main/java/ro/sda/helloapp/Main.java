package ro.sda.helloapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.sda.helloapp.config.ProjectConfig;
import ro.sda.helloapp.services.HelloService;

public class Main {
    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            HelloService service = context.getBean(HelloService.class);
            service.sayHello();
        }
    }
}
