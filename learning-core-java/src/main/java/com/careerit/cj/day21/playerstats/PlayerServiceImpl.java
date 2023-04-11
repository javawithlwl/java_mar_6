package com.careerit.cj.day21.playerstats;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PlayerServiceImpl implements PlayerService {

  private List<Player> players;

  public PlayerServiceImpl() {
    try {
      players = CsvReaderUtil.loadPlayers();
    } catch (IOException e) {
      e.printStackTrace();
      throw new RuntimeException(e);
    }
  }

  @Override
  public double maxAmount() {
    double max = players.get(0).getAmount();
    for (int i = 1; i < players.size(); i++) {
      Player player = players.get(i);
      if (max < player.getAmount()) {
        max = player.getAmount();
      }
    }
    return max;
  }

  @Override
  public List<Player> getPlayers(Predicate<Player> predicate) {
      List<Player> list = new ArrayList<>();
      for(Player p:players){
          if(predicate.test(p)){
              list.add(p);
          }
      }
      return list;
  }

  @Override
  public List<TeamStatsDto> getTeamAmountStats() {
        List<TeamStatsDto> teamStatList = new ArrayList<>();
        List<String> teamNames = getTeamNames();
        for(String teamName:teamNames){
            List<Player> list = getPlayers(player -> player.getTeam().equals(teamName));
            double totalAmount = totalAmount(list);
            TeamStatsDto obj = new TeamStatsDto();
            obj.setTeamName(teamName);
            obj.setTotalAmount(totalAmount);
            teamStatList.add(obj);
        }
        return teamStatList;

  }

  @Override
  public List<RoleAmountDto> getTeamRoleStats(String teamName) {
    //1. Get player of given team
    //2. Get Roles
    //3. Get players of the given role
    //4. Find sum of amount create role amount dto add to list
    return null;
  }

  @Override
  public List<Player> getTopPaidPlayers(int n) {
    return null;
  }

  @Override
  public List<String> getTeamNames() {
        List<String> teamNames = new ArrayList<>();
        for(Player player:players){
            String tName = player.getName();
            if(!teamNames.contains(tName)){
                teamNames.add(tName);
            }
        }
        return teamNames;
  }
  private double totalAmount(List<Player> list){
      double total = 0;
      for(Player player:list){
          total += player.getAmount();
      }
      return total;
  }
}
