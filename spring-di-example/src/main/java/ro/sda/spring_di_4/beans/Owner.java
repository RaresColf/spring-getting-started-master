package ro.sda.spring_di_4.beans;


import org.springframework.stereotype.Component;

@Component
public class Owner {

    private Cat cat;

    public Owner(Cat cat) {
        this.cat = cat;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }
}
