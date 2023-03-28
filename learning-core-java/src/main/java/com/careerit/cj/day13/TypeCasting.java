package com.careerit.cj.day13;


public class TypeCasting {

  public static void main(String[] args) {

    int a = 10;
    float b = a;
    System.out.println(a);
    System.out.println(b);

    float c = 10.05f;
    int d = (int)c;
    System.out.println(c);
    System.out.println(d);

    String ageStr = "37";
    int age = Integer.parseInt(ageStr);
    System.out.println(age+3);

    Integer obj = Integer.valueOf(100);
    int value = obj;
    obj = 200;

  }
}
