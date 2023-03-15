package com.careerit.cj.day3;

import java.util.Scanner;

public class NaturalNumberSum {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the n value :");
    int n = sc.nextInt();
    int sum = 0;
    for (int i = 1; i <= n; i++) {
        sum += i;
    }
    System.out.println("The sum of first "+n+" natural numbers is :"+sum);
  }
}
