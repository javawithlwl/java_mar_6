package com.careerit.cj.day19;

import java.util.List;

class Outer {

  private static List<String> list = List.of("Krish", "Manoj", "Charan", "Mahesh");

  static class Inner {
    void show() {
      for (String ele : list) {
        System.out.println(ele);
      }
    }
  }
}

interface Operations {
  double perform(double a, double b);
}



public class InnerClassManager {

  public static void main(String[] args) {
    Outer.Inner inner = new Outer.Inner();
    inner.show();
    Operations obj1 = (a, b)-> a * b;
    System.out.println(obj1.perform(4, 5));
    Operations obj2 = (a, b)-> a + b;
    System.out.println(obj2.perform(4, 5));
  }
}
