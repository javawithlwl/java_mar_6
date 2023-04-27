package com.careerit.iplstats.service;

import com.careerit.iplstats.dto.*;

import java.util.List;

public class IplStatJdbcService implements  IplStatService{
  @Override
  public List<TeamBasicDto> getTeamBasicDetails() {
    return null;
  }

  @Override
  public List<PlayerDto> getPlayers(String team) {
    return null;
  }

  @Override
  public List<TeamAmountStats> getTeamAmountStats() {
    return null;
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
