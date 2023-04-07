package com.careerit.cj.day21;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Consumer;

public class ListExample2 {

  public static void main(String[] args) {

    // Generate 20 random numbers, store in container object and display them.

    List<Integer> list = new ArrayList<>();
    for (int i = 1; i <= 20; i++) {
      int num = ThreadLocalRandom.current().nextInt(100, 999);
      list.add(num);
    }
//    System.out.println("By using for");
//    for (int i = 0; i < list.size(); i++) {
//      int ele = list.get(i);
//      System.out.println(ele);
//    }
//    System.out.println("By using for-each");
//    for (Integer ele : list) {
//      System.out.println(ele);
//    }
//    System.out.println("By using iterator");
//
//    Iterator<Integer> iterator = list.iterator();
//    System.out.println(list);
//    while (iterator.hasNext()) {
//      int num = iterator.next();
//      if (num % 2 == 0) {
//        iterator.remove();
//      }
//      System.out.println(num);
//    }
//    System.out.println(list);
//
//    ListIterator<Integer> listItr = list.listIterator();
//    System.out.println(list);
//    while (listItr.hasNext()) {
//      int num = listItr.next();
//      if (num % 2 == 0) {
//         listItr.set(num+1);
//      }
//      System.out.println(num);
//    }
//    while(listItr.hasPrevious()){
//      int num = listItr.previous();
//      if (num % 2 == 0) {
//        listItr.remove();
//      }
//      System.out.println(num);
//    }
//    System.out.println(list);


    list.forEach(ele-> System.out.print(ele+" "));

  }

}
