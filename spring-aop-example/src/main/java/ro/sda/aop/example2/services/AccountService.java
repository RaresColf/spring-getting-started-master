package ro.sda.aop.example2.services;

import org.springframework.stereotype.Service;
import ro.sda.aop.example2.annotation.LoggerAudit;
import ro.sda.aop.example2.models.Account;

import java.security.PublicKey;

@Service
public class AccountService {

    Account account;

    public String getMyIban(){
        return account.getIban();
    }

    public void init(){
        System.out.println("Post construct executed");
        account = new Account("iban348585884", "John", 5222222);
    }
    @LoggerAudit()
    public int getAccountBalance(){
        return account.getBalance();
    }
    @LoggerAudit("info account retrived")
    public Account getAccount(){
        return account;
    }

}
