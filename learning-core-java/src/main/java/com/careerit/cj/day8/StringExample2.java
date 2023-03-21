package com.careerit.cj.day8;

public class StringExample2 {
  public static void main(String[] args) {

    String name1 = "Core";
    String name2 = "Core Java";
    name1 = name1.concat(" Java");
    System.out.println(name1 == name2);
    System.out.println(name1.equals(name2));
  }
}
