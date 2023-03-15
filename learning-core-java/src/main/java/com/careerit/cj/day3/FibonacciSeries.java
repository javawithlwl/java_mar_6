package com.careerit.cj.day3;

import java.math.BigInteger;

public class FibonacciSeries {

  public static void main(String[] args) {
//      int n = 100;
//      int a = 0,b=1;
//      for(;a <=n ;){
//        System.out.print(a+" ");
//        int sum = a + b;
//        a = b;
//        b = sum;
//      }
    int n = 100;
    BigInteger a = BigInteger.valueOf(0);
    BigInteger b = BigInteger.valueOf(1);
    for (int i = 1; i <= n; i++) {
      System.out.print(a + " ");
      BigInteger sum = a.add(b);
      a = b;
      b = sum;
    }

  }
}
