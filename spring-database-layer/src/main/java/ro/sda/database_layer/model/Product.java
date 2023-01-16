package ro.sda.database_layer.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Product {

    private int id;
    private String name;

    public Product(String name) {
        this.name = name;
    }

}
