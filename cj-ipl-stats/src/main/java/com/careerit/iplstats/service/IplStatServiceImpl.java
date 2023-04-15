package com.careerit.iplstats.service;

import com.careerit.iplstats.domian.Player;
import com.careerit.iplstats.domian.Team;
import com.careerit.iplstats.dto.*;
import com.careerit.iplstats.util.JsonReaderUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class IplStatServiceImpl implements IplStatService {
  private List<Player> players;
  private List<Team> teams;
  private Map<String, Team> teamMap;
  private Map<String, List<Player>> playersMap;

  public IplStatServiceImpl() {
    players = JsonReaderUtil.loadPlayers();
    teams = JsonReaderUtil.loadTeamDetails();
    teamMap = teams.stream().collect(Collectors.toMap(ele -> ele.getTeam(), Function.identity()));
    playersMap = players.stream().collect(Collectors.groupingBy(Player::getTeam));
  }

  @Override
  public List<TeamBasicDto> getTeamBasicDetails() {
    return teams.stream().map(ele -> {
      TeamBasicDto obj = new TeamBasicDto();
      obj.setTeam(ele.getTeam());
      obj.setTeamName(ele.getTeamName());
      return obj;
    }).collect(Collectors.toList());
  }

  @Override
  public List<PlayerDto> getPlayers(String team) {
    Team teamDetails = teamMap.get(team);
    List<Player> teamPlayers = playersMap.get(team);
    List<PlayerDto> list = teamPlayers.stream().map(ele -> {
      PlayerDto obj = new PlayerDto();
      obj.setTeamName(teamDetails.getTeamName());
      obj.setRole(ele.getRole());
      obj.setPrice(ele.getPrice());
      obj.setName(ele.getName());
      obj.setCountry(ele.getCountry());
      obj.setTeam(ele.getTeam());
      return obj;
    }).collect(Collectors.toList());
    return list;
  }

  @Override
  public List<TeamAmountStats> getTeamAmountStats() {
    List<TeamAmountStats> list = new ArrayList<>();
    teamMap.entrySet().forEach(ele -> {
      List<Player> players = playersMap.get(ele.getKey());
      double totalAmount = players.stream().mapToDouble(p -> p.getPrice()).sum();
      TeamAmountStats obj = new TeamAmountStats();
      obj.setTeam(ele.getKey());
      obj.setTeamName(ele.getValue().getTeamName());
      obj.setTotalAmount(totalAmount);
      list.add(obj);
    });
    return list;

  }

  @Override
  public List<RoleAmountStats> getRoleAmountStats() {
    return null;
  }

  @Override
  public List<TeamRoleCountDto> getRoleCountStats(String team) {
    return null;
  }

  @Override
  public List<PlayerDto> getPlayers(String team, String role) {
    return null;
  }


}
