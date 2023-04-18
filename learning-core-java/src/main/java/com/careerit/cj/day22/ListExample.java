package com.careerit.cj.day22;

import com.careerit.cj.day21.playerstats.CsvReaderUtil;
import com.careerit.cj.day21.playerstats.Player;
import com.careerit.cj.day21.playerstats.TeamStatsDto;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ListExample {

  public static void main(String[] args) {

    List<Player> players = getPlayers();
    List<String> playerNames = getPlayerNames(players);
    playerNames.forEach(ele -> {
      System.out.println(ele);
    });
    List<Integer> list = IntStream.rangeClosed(1, 100).boxed().toList();
    // Get all the numbers which are divisible by 3 and 6 not with 9
    // double each number, filter numbers in range 30 to 50

    List<Integer> filteredList = list.stream()
        .filter(ele -> ele % 3 == 0 && ele % 6 == 0 && ele % 9 != 0)
        .map(ele -> ele * 2)
        .filter(ele -> ele >= 30 && ele <= 50).toList();


  }

  public List<TeamStatsDto> getTeamAmountStats(List<Player> players) {
//    List<TeamStatsDto> teamStatList = new ArrayList<>();
//    Set<String> teamNames = players.stream().map(p->p.getTeam()).collect(Collectors.toSet());
//    for(String teamName:teamNames){
//      List<Player> list = players.stream().filter(p->p.getTeam().endsWith(teamName)).toList();
//      double totalAmount = list.stream().mapToDouble(p->p.getAmount()).sum();
//      TeamStatsDto obj = new TeamStatsDto();
//      obj.setTeamName(teamName);
//      obj.setTotalAmount(totalAmount);
//      teamStatList.add(obj);
//    }
//    return teamStatList;
    List<TeamStatsDto> ret = players
        .stream()
        .collect(Collectors.groupingBy(Player::getTeam))
        .entrySet().stream().map(ele -> {
              double totalAmount = ele.getValue().stream().mapToDouble(p -> p.getAmount()).sum();
              TeamStatsDto obj = new TeamStatsDto();
              obj.setTeamName(ele.getKey());
              obj.setTotalAmount(totalAmount);
              return obj;
        }).toList();
    return ret;
  }

  public static List<String> getPlayerNames(List<Player> players) {
//          List<String> namesList = new ArrayList<>();
//          for(Player player:players){
//              namesList.add(player.getName());
//          }
//          return namesList;
    return players
        .stream()
        .map(p -> p.getName())
        .toList();
  }

  public static List<String> getPlayerNamesWithLike(List<Player> players, String str) {
    List<String> namesList = new ArrayList<>();
    for (Player player : players) {
      if (player.getName().contains(str)) {
        namesList.add(player.getName());
      }
    }
//    return namesList;
    return players.stream()
        .filter(p -> p.getName().contains(str))
        .map(p -> p.getName())
        .toList();

  }

  public static Set<String> getTeamNames(List<Player> players) {
    return players.stream().map(p -> p.getTeam()).collect(Collectors.toSet());
  }

  public static List<Player> getPlayers() {
    List<Player> list = new ArrayList<>();
    try {
      list = CsvReaderUtil.loadPlayers();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
    return list;
  }
}
