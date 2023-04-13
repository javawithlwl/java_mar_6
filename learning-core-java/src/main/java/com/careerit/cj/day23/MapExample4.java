package com.careerit.cj.day23;

import com.careerit.cj.day21.playerstats.CsvReaderUtil;
import com.careerit.cj.day21.playerstats.Player;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample4 {

  public static void main(String[] args) throws IOException {

    List<Player> players = CsvReaderUtil.loadPlayers();
    Map<String,List<Player>> map = new HashMap<>();

    for(Player player:players){
        map.putIfAbsent(player.getTeam(),new ArrayList<>());
        List<Player> list = map.get(player.getTeam());
        list.add(player);
        map.put(player.getTeam(),list);
    }
    map.entrySet().forEach(ele->{
      System.out.println(ele.getKey()+" "+ele.getValue());
    });




  }
}
