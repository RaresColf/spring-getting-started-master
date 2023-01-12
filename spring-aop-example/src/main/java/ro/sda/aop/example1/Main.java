package ro.sda.aop.example1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.sda.aop.example1.config.ProjectConfig;
import ro.sda.aop.example1.services.MathService;

public class Main {

    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            MathService service = context.getBean(MathService.class);

            service.add(7, 2);
            service.substract(9, 4);
            service.devide(7, 8);

            try {
                service.add(2, 2);
            } catch (RuntimeException e) {

            }

            try {
                service.devide(2, 2);
            } catch (RuntimeException e) {

            }
        }


    }
}



