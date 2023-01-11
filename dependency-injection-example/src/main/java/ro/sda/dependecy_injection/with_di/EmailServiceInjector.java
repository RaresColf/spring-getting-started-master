package ro.sda.dependecy_injection.with_di;

public class EmailServiceInjector implements MessageServiceInjector {
  
  @Override
  public Consumer getConsumer() {
    return new MyDIApplication(new EmailServiceImpl());
  }
}
