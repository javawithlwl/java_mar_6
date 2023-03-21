package com.careerit.cj.day8;

public class StringExample3 {

  public static void main(String[] args) {

      String name = "Random ";

    System.out.println(name.length());
    System.out.println(name.charAt(2));
    System.out.println(name.toUpperCase());
    System.out.println(name.toLowerCase());
    System.out.println(name.contains("dom"));
    System.out.println(name.startsWith("R"));
    System.out.println(name.trim());
    System.out.println(name.substring(3));
    System.out.println(name.substring(2,5));

  }
}
