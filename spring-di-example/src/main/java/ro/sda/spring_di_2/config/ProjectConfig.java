package ro.sda.spring_di_2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ro.sda.spring_di_2.beans.Dog;
import ro.sda.spring_di_2.beans.Owner;

@Configuration
public class ProjectConfig {
    @Bean
    public Owner owner()  {
        Owner o = new Owner();
        o.setName("Catalin");
        // if @Autowired present on the field we don't need to inject dependecy using the setter
        o.setDog(dog());
        return o;
    }

    @Bean
    public Dog dog()  {
         Dog d = new Dog("Maxx");
        return d;
    }
}
