package ro.sda.helloapp.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ro.sda.helloapp.services.HelloService;
import ro.sda.helloapp.services.NameService;

@Service
public class SimpleHelloService implements HelloService {
    private NameService nameService;

    @Autowired
    public SimpleHelloService(@Qualifier("random") NameService nameService) {
        this.nameService = nameService;
    }

    @Override
    public void sayHello() {
        String name = nameService.getName();
        System.out.println("Hello, " + name + "!");
    }
}

