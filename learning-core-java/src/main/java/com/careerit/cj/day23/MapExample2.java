package com.careerit.cj.day23;

import java.util.HashMap;
import java.util.Map;

public class MapExample2 {

  public static void main(String[] args) {

    Map<String, Integer> map = new HashMap<>();

    map.putIfAbsent("Krish", 0);
    int value = map.get("Krish");
    map.put("Krish", value + 1);

    map.putIfAbsent("Manoj", 0);
    map.put("Manoj", map.get("Manoj") + 1);
    System.out.println(map);

  }
}
