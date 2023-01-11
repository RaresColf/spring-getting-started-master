package ro.sda.spring_di_2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.sda.spring_di_2.beans.Dog;
import ro.sda.spring_di_2.beans.Owner;
import ro.sda.spring_di_2.config.ProjectConfig;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Owner o = context.getBean(Owner.class);
        Dog d = o.getDog();
        System.out.println(d);

        System.out.println("-----------------------");

        Dog d1 = context.getBean(Dog.class);
        System.out.println(d1);

        System.out.println("-----------------------");

        Owner o1 = context.getBean(Owner.class);
        Dog d2 = o1.getDog();
        System.out.println(d2);

    }


}
