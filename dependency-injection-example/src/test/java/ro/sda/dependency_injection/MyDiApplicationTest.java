package ro.sda.dependency_injection;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ro.sda.dependecy_injection.with_di.Consumer;
import ro.sda.dependecy_injection.with_di.MessageService;
import ro.sda.dependecy_injection.with_di.MessageServiceInjector;
import ro.sda.dependecy_injection.with_di.MyDIApplication;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyDiApplicationTest {
  
  private MessageServiceInjector injector;
  private static ByteArrayOutputStream outputContent;
  private static int counter = 1;

  @BeforeAll
  public static void setUpAtTheBeginning(){
    outputContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outputContent));
    System.err.println("BeforeAll executed!");
  }
  
  @BeforeEach
  public void setUpBeforeEachTest() {
    // mock the injector with anonymous class
    injector = new MessageServiceInjector() {

      @Override
      public Consumer getConsumer() {
        // mock the message service
        return new MyDIApplication(new MessageService() {

          @Override
          public void sendMessage(String msg, String rec) {
            System.out.print("Mock Message Service implementation " + counter++);
          }
        });
      }
    };
    System.err.println("BeforeEach executed!");
  }

  @AfterEach
  public void resetAfterEach(){
    outputContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outputContent));
    System.err.println("BeforeEach executed!");
  }

  @Test
  public void testApp() {
    Consumer consumer = injector.getConsumer();
    consumer.processMessages("ALERT", "Catalin@abc.com");

    assertEquals("Mock Message Service implementation 1" , outputContent.toString());
  }

  @Test
  public void testApp2() {
    Consumer consumer = injector.getConsumer();
    consumer.processMessages("ALERT", "Catalin@abc.com");

    assertEquals("Mock Message Service implementation 2", outputContent.toString());
  }
  
  
}
  

