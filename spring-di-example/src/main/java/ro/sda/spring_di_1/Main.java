package ro.sda.spring_di_1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.sda.spring_di_1.beans.Cat;
import ro.sda.spring_di_1.components.Dog;
import ro.sda.spring_di_1.config.ProjectConfig;

public class Main {


  public static void main(String[] args) {
    try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
      
      // by type sau by name
      Cat c1 = context.getBean("cat", Cat.class);
      c1.sayMeow();

      Dog dog = context.getBean(Dog.class);
      dog.sayHam();
    }
  }
}
