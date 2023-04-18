package com.careerit.cj.day23;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {

  public static void main(String[] args) {

    Map<Integer, String> map = new HashMap<>();
    map.put(1001, "Krish");
    map.put(1002, "Manoj");
    map.put(1003, "Rajesh");

    System.out.println(map);

    Set<Integer> keys = map.keySet();

    for (Integer key : keys) {
      System.out.println(key + " " + map.get(key));
    }
    Collection<String> values = map.values();
    System.out.println(values);

    Set<Map.Entry<Integer,String>> enterySet = map.entrySet();
    for (Map.Entry<Integer, String> entry : enterySet) {
      System.out.println(entry.getKey() + " " + entry.getValue());
    }

    map.entrySet().forEach(ele->{
      System.out.println(ele.getKey()+" "+ele.getValue());
    });
    System.out.println(map.isEmpty());

    map.putIfAbsent(1004,"Charan");

    System.out.println(map);

  }
}
