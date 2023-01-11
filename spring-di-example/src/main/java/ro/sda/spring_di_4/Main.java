package ro.sda.spring_di_4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.sda.spring_di_4.beans.Cat;
import ro.sda.spring_di_4.beans.Owner;
import ro.sda.spring_di_4.config.ProjectConfig;

public class Main {

    public static void main(String[] args) {


        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Cat c1 = context.getBean(Cat.class);
        System.out.println(c1);


        Owner o = context.getBean(Owner.class);
        Cat c3 = o.getCat();


        System.out.println(o);
        System.out.println(c3);

        System.out.println("App is finishing");




    }
}
