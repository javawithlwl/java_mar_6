package com.careerit.cj.day4;

public class GcdOfTwoNumbers {
  public static void main(String[] args) {

    int a = 45;
    int b = 75;

    while (a != b) {
      if (a > b) {
        a = a - b;
      } else {
        b = b - a;
      }
    }
    System.out.println("GCD is :" + a);

  }
}
