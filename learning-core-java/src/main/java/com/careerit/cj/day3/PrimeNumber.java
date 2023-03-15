package com.careerit.cj.day3;

import java.util.Scanner;

public class PrimeNumber {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the n value :");
    int n = sc.nextInt();
    // display factors of given number
    int count = 0;
    for (int i = 1; i <= n; i++) {
      if (n % i == 0) {
         count++;
      }
    }
    if(count == 2){
      System.out.println(n+" is prime");
    }else{
      System.out.println(n+" is not a prime");
    }

  }
}
