package ro.sda.helloapp.services.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ro.sda.helloapp.services.NameService;

@Service
@Qualifier("simple")
public class SimpleNameService implements NameService {
    @Override
    public String getName() {
        return "John";
    }
}
