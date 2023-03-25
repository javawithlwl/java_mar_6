package com.careerit.cj.day12;

public class StaticBlock {

  static {
    System.out.println("One");
  }

  public static void main(String[] args) {
    System.out.println("Main method");
  }

  static {
    System.out.println("Two");
  }
}
