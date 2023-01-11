package ro.sda.dependecy_injection.with_di;

/**
 * We are not required to have base interfaces for consumer classes, but I will have a Consumer interface declaring contract for consumer classes.
 */
public interface Consumer {
  void processMessages(String msg, String rec);
}