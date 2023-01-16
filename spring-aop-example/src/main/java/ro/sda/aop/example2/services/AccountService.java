package ro.sda.aop.example2.services;

import org.springframework.stereotype.Service;
import ro.sda.aop.example2.annotation.LoggerAudit;
import ro.sda.aop.example2.models.Account;

import javax.annotation.PostConstruct;
import java.security.PublicKey;

@Service
public class AccountService {
    Account account;

    @PostConstruct
    public void init() {
        System.out.println("Post construct executed!");
        account = new Account("ibanro1234", "Claudiu", 500000);
    }

    @LoggerAudit(value = "iban retrieved")
    public String getMyIban() {
        return account.getIban();
    }

    @LoggerAudit("account balance retrieved")
    public int getAccountBalance() {
        return account.getBalance();
    }

    @LoggerAudit
    public Account getAccountInfo() {
        return account;
    }

}
