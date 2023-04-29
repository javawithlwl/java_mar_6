package com.careerit.cj;

import lombok.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
class User {
  private int id;
  private String username;
  private String password;
  private String email;

}

class LoginService {

  private Map<String, User> userMap = new HashMap<>();

  public LoginService() {
    userMap = loadUserFromFile();
  }

  private Map<String, User> loadUserFromFile() {
    File file = new File(LoginService.class.getResource("/sample_data.csv").getFile());
    Map<String, User> map = new HashMap<>();
    try {
      List<String> lines = Files.readAllLines(file.toPath());
      for (int i = 1; i < lines.size(); i++) {
        String[] data = lines.get(i).split(",");
        int id = Integer.parseInt(data[0]);
        String username = data[1];
        String password = data[2];
        String email = data[3];
        User user = User.builder().id(id).username(username).email(email).password(password).build();
        map.put(username, user);
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
    return map;
  }

  public User login(String username, String password) {
    User user = userMap.get(username);
    if(user==null){
          throw new IllegalArgumentException("Bad credentials, please check username or password");
    }else{
        if(user.getPassword().equals(password)){
          return user;
        }else{
          throw new IllegalArgumentException("Bad credentials, please check username or password");
        }
    }
  }


}

public class LoginServiceManager {
}
