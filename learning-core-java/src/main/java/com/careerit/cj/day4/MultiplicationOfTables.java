package com.careerit.cj.day4;

public class MultiplicationOfTables {

  public static void main(String[] args) {
    int n = 20;
    for (int j = 1; j <= n; j++) {
      int num = j;
      for (int i = 1; i <= 10; i++) {
        System.out.println(num + " * " + i + " = " + (num * i));
      }
      System.out.println("-".repeat(50));
    }
  }
}
