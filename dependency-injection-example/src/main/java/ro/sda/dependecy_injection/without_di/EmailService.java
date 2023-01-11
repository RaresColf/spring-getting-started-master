package ro.sda.dependecy_injection.without_di;

/**
 * EmailService class holds the logic to send an email message to the recipient email address.
 */
public class EmailService {

  public void sendEmail(String message, String receiver) {
    // logic to send email
    System.out.print("Email sent to " + receiver + " with message=" + message);
  }
}
