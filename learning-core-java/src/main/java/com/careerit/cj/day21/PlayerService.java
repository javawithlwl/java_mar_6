package com.careerit.cj.day21;

import java.util.List;

public interface PlayerService {


      double maxAmount();
      List<Player> getPlayersByTeam(String teamName);
      List<Player> getPlayersAmountGt(double amount);
      List<Player> getPlayersByCountry(String countryName);
      List<Player> getPlayersByCountryAndRole(String countryName,String role);
}
