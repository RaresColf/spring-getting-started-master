package ro.sda.json._1_;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.List;

public class JsonProcessor {


  public static void main(String[] args) {
    
    System.out.println(userToJson(new User("Leo Messi", 35)));
    
    System.out.println(userToJson("Ronaldo", 38));
    
    // list.of works from java 9 version (not working in java 8)
    List<User> userList = List.of(new User("Gigel", 29), new User("Maxum", 35), new User("Joao", 40));
    
    System.out.println(userArrayToJson(userList));
    
  }
  
  private static JSONObject userToJson(String name, int age) {
    JSONObject jsonObj = new JSONObject();

    jsonObj.put("name", name);
    jsonObj.put("age", age);

    return jsonObj;
  }

  private static JSONObject userToJson(User user) {
    return new JSONObject(user);
  }
  
  private static JSONArray userArrayToJson(List<User> list){
    JSONArray jsonArray = new JSONArray();
    
    for(User u : list){
      jsonArray.put(new JSONObject(u));
    }
    
    return jsonArray;
  }
  
}
