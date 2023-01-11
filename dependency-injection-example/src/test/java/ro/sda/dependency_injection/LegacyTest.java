package ro.sda.dependency_injection;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ro.sda.dependecy_injection.without_di.EmailService;
import ro.sda.dependecy_injection.without_di.MyOtherApplication;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * One can argue that we can remove the email service instance creation from MyApplication class by having a constructor that requires email service as an argument.
 * 
 * But in this case, we are asking client applications or test classes to initializing the email service and that is not a good design decision. 
 * 
 * Now let’s see how we can apply java dependency injection pattern to solve all the problems with the above implementation. 
 * Dependency Injection in java requires at least the following:
 * -> Service components should be designed with base class or interface. It’s better to prefer interfaces or abstract classes that would define contract for the services.
 * -> Consumer classes should be written in terms of service interface.
 * -> Injector classes that will initialize the services and then the consumer classes.
 */

public class LegacyTest {
  
  private final ByteArrayOutputStream outputContent = new ByteArrayOutputStream();

  @BeforeEach
  public void setUpStreams() {
    System.setOut(new PrintStream(outputContent));
  }

  @Test
  public void legacyTest(){

    MyOtherApplication app = new MyOtherApplication(new EmailService());
    
    app.processMessages("ALERT", "Catalin@abc.com");

    assertEquals("Email sent to Catalin@abc.com with message=ALERT", outputContent.toString());
  }
  
}
