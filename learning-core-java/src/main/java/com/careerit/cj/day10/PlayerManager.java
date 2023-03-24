package com.careerit.cj.day10;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

public class PlayerManager {
  public static void main(String[] args) throws URISyntaxException, IOException {

    PlayerService playerService = new PlayerService();
    String team = "RCB";
    List<Player> rcbPlayers = playerService.getPlayerByTeam(team);
    System.out.println(String.format("%s has total %s players",team,rcbPlayers.size()));
    System.out.println("-".repeat(100));
    double maxAmount = playerService.getMaxAmount();
    List<Player> maxPaidPlayersList = playerService.getMaxPaidPlayers();
    System.out.println(String.format("%s player(s) are getting max amount %s",maxPaidPlayersList.size(),maxAmount));
    for(Player p:maxPaidPlayersList){
      System.out.println(p);
    }
  }
}
