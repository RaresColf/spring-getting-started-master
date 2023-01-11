package ro.sda.helloapp.services.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ro.sda.helloapp.services.NameService;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ro.sda.helloapp.services.NameService;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
@Qualifier("random")
public class RandomNameService implements NameService {
    @Override
    public String getName() {
        List<String> names = Arrays.asList("Messi", "Ronaldo", "Neymar", "Mbappe");
        int i = new Random().nextInt(4);
        return names.get(i);
    }
}
