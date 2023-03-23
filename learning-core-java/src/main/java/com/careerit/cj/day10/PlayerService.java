package com.careerit.cj.day10;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class PlayerService {

      private List<Player> list;

      public PlayerService() throws URISyntaxException, IOException {
          list = new ArrayList<>();
          // Load from csv => add player to the list
          List<String> rows = Files.readAllLines(Path.of(PlayerService.class
                                     .getResource("/players.csv").toURI()));
          for(int i=1;i<rows.size();i++) {
            String data = rows.get(i);
            Player player = getPlayer(data);
            list.add(player);
          }
        System.out.println("Total player count :"+list.size());

      }
      public List<Player> getPlayerByTeam(String team){
        return null;
      }
      public List<Player> getMaxPaidPlayers(){
        return null;
      }
      public int playerCount(String teamName){
          return 0;
      }
      public List<Player> getPlayerByCountry(String country){
          return null;
      }

      private Player getPlayer(String data){
        String[] arr = data.split(",");
        Player player = new Player();
        UUID id = UUID.randomUUID();
        String name = arr[0];
        String role = arr[1];
        double amount = Double.parseDouble(arr[2]);
        String country = arr[3];
        String team = arr[4];
        player.setId(id);
        player.setAmount(amount);
        player.setCountry(country);
        player.setName(name);
        player.setRole(role);
        player.setTeam(team);
        return player;
      }

}
