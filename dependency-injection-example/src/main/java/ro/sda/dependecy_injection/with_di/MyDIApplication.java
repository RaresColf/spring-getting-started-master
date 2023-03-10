package ro.sda.dependecy_injection.with_di;

/**
 * Notice that our application class is just using the service. It does not initialize the service that leads to better “separation of concerns”. 
 * Also use of service interface allows us to easily test the application by mocking the MessageService and bind the services at runtime rather than compile time. 
 * Now we are ready to write java dependency injector classes that will initialize the service and also consumer classes.
 */


public class MyDIApplication implements Consumer {

  private MessageService service;

  public MyDIApplication(MessageService service) {
    this.service = service;
  }

  @Override
  public void processMessages(String msg, String rec) {
    // do some msg validation, manipulation logic etc
    this.service.sendMessage(msg, rec);
  }

}
