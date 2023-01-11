package ro.sda.dependecy_injection.with_di;

/**
 * As you can see that our application classes are responsible only for using the service. Service classes are created in injectors. 
 * Also, if we have to further extend our application to allow facebook messaging, we will have to write a new service class and injector class only. 
 * So dependency injection implementation solved the problem with hard-coded dependency and helped us in making our application flexible and easy to extend. 
 * Now let’s see how easily we can test our application class by mocking the injector and service classes.
 */
public class MessageDiMain {

  public static void main(String[] args) {
    
    String msg = "ALERT";
    String email = "Catalin@abc.com";
    String phone = "0722222222";
    
    MessageServiceInjector injector = null;
    Consumer app = null;

    // Send email
    injector = new EmailServiceInjector();
    app = injector.getConsumer();
    app.processMessages(msg, email);

    // Send SMS
    injector = new SmsServiceInjector();
    app = injector.getConsumer();
    app.processMessages(msg, phone);
  }
  
  
}
