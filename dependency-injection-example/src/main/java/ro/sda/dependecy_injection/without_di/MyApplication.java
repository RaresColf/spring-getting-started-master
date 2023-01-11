package ro.sda.dependecy_injection.without_di;

public class MyApplication {

  private EmailService emailService = new EmailService();

  public void processMessage(String msg, String receiver) {
    //do some msg validation, manipulation logic etc
    this.emailService.sendEmail(msg, receiver);
  }
  
}
