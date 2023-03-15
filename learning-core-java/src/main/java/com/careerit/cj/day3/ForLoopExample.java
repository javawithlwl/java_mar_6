package com.careerit.cj.day3;

// Print "Welcome to Java World"

import java.util.Scanner;

public class ForLoopExample {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the n value :");
    int n = sc.nextInt();
    for (int i = 1; i <= n; i++) {
      System.out.println("Welcome to Java World");
    }
  }
}
