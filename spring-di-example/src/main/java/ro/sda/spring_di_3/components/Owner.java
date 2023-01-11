package ro.sda.spring_di_3.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Owner {

    private String name;
 // @Autowired
    private Dog dog;

    public Owner(Dog dog) {   // nu trebuie sa mai punem @Autowired pe constructor, il vede automat
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog getDog() {
        return dog;
    }
    // @Autowired
    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
