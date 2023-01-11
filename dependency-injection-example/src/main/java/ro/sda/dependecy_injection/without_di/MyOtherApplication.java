package ro.sda.dependecy_injection.without_di;

public class MyOtherApplication {

  private EmailService email = null;

  public MyOtherApplication(EmailService svc) {
    this.email = svc;
  }

  public void processMessages(String msg, String rec) {
    //do some msg validation, manipulation logic etc
    this.email.sendEmail(msg, rec);
  }

}
  

