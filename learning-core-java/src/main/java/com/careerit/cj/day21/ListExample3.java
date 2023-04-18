package com.careerit.cj.day21;

import java.util.ArrayList;
import java.util.List;

public class ListExample3 {

  public static void main(String[] args) {

    List<Integer> list1 = new ArrayList<>();
    list1.add(1);
    list1.add(3);
    list1.add(5);
    list1.add(7);
    list1.add(9);

    List<Integer> list2 = new ArrayList<>();
    list2.add(2);
    list2.add(4);
    list2.add(6);
    list2.add(8);

    List<Integer> list3 = new ArrayList<>();
    list3.addAll(list1);
    list3.addAll(list2);
    System.out.println(list3);

    System.out.println(list3.contains(3));
    System.out.println(list3.containsAll(list1));
    System.out.println(list3.subList(2,5));
    System.out.println(list3.isEmpty());
    System.out.println(list3.remove(Integer.valueOf(3)));
  }
}
