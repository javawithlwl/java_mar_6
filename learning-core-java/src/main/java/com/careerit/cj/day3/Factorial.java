package com.careerit.cj.day3;

import java.util.Scanner;

public class Factorial {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the n value :");
    int n = sc.nextInt();
    int fact = 1;
    for (int i = 2; i <= n; i++) {
      fact *= i;
    }
    System.out.println("Factorial of "+n+" is "+fact);
  }
}
