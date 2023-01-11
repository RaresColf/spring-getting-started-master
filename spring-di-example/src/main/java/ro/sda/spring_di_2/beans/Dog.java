package ro.sda.spring_di_2.beans;

public class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "HEX of the object: " + super.toString() + "\nDog{" +
                "name='" + name + '\'' +
                '}';
    }


}



