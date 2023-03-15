package com.careerit.cj.day3;

import java.util.Scanner;

public class MultiplicationOfTable {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the n value :");
    int n = sc.nextInt();
    for (int i = 10; i >= 1; i--) {
      System.out.println(n + " * " + i + " = " + (n * i));
    }
  }
}
