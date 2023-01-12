package ro.sda.aop.example2.models;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Account {

    private String iban;
    private String clientName;
    private int balance;

}
