package ro.sda.aop.example2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.sda.aop.example2.config.ProjectConfig;
import ro.sda.aop.example2.services.AccountService;

public class Main {
    public static void main(String[] args) {
        try (var c = new  AnnotationConfigApplicationContext(ProjectConfig.class)) {
            AccountService accountService = c.getBean(AccountService.class);

            accountService.getAccountBalance();
            accountService.getAccountInfo();
            accountService.getMyIban();
        }
    }
}

