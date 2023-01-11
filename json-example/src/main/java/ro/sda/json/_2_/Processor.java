package ro.sda.json._2_;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class Processor {
  
  public static void main(String[] args) throws IOException {

    ObjectMapper mapper = new ObjectMapper();
    
    Car car = new Car("renault", "yellow", 100, true);
    
    System.out.println(mapper.writeValueAsString(car));
    
    
  }
}
