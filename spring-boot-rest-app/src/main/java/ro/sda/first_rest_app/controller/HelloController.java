package ro.sda.first_rest_app.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import ro.sda.first_rest_app.model.Person;

@RestController
@Slf4j
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }



    @GetMapping("/hello/{name}")
    public String helloPathParam(@PathVariable("name") String name){
        return "Hello " + name + " !" ;

    }

    @PostMapping("/create-person")
    public String createPerson(@RequestBody Person person){
        log.info(person.toString());
        return "person received";
    }

    @GetMapping("/other-person")
    public Person getOtherPerson(@RequestParam("identifier") String identifier){
        log.error("Request received: /other-person with identifier:" + identifier);
        return new Person("Messi", 35);
    }
}
