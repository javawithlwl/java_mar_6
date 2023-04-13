package com.careerit.cj.day23;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JsonExample {

  private User[] userlist;
  private Map<String,User> map=new HashMap<>();

  public JsonExample() throws IOException {
    ObjectMapper objectMapper = new ObjectMapper();
    userlist = objectMapper.readValue(JsonExample.class.getResource("/users.json"), User[].class);
    for(User user:userlist){
        map.put(user.getUsername(),user);
    }
  }

  public String login(String username, String password) {
      if(map.get(username)!=null){
          User user = map.get(username);
          if(user.getPassword().equals(password)){
            return user.getUsername();
          }
      }
      return null;
  }

  public static void main(String[] args) throws IOException {
    JsonExample obj = new JsonExample();
    String username = obj.login("krish", "krish@123");
    if (username != null) {
      System.out.println("Welcome " + username);
    } else {
      System.out.println("Bad credentials please check username or password");
    }
  }
}
