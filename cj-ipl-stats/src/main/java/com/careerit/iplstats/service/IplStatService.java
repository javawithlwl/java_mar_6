package com.careerit.iplstats.service;
import com.careerit.iplstats.dto.*;
import java.util.List;

public interface IplStatService {
      List<TeamBasicDto> getTeamBasicDetails();
      List<PlayerDto> getPlayers(String team);
      List<TeamAmountStats> getTeamAmountStats();
      List<RoleAmountStats> getRoleAmountStats();
      List<TeamRoleCountDto> getRoleCountStats(String team);
      List<PlayerDto> getPlayers(String team,String role);
}
