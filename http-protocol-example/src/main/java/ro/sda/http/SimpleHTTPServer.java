package ro.sda.http;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;

public class SimpleHTTPServer {


  public static void main(String args[]) throws IOException {
    
    ServerSocket server = new ServerSocket(8080);
    
    System.out.println("Listening for connection on port 8080 ....");
    
    while (true) {
      try (Socket socket = server.accept()) {
        LocalDate today = LocalDate.now();
        String httpResponse = "HTTP/1.1 200 OK\r\n\r\n" + today;
        socket.getOutputStream().write(httpResponse.getBytes(StandardCharsets.UTF_8));
      }
    }
  }
}

