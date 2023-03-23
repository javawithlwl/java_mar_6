package com.careerit.cj.day10;

import java.util.List;

public class MathManager {

  public static void main(String[] args) {
    MathOperations obj = new MathOperations();
    List<Integer> primeList = obj.generatePrime(1, 10);
    System.out.println(primeList);
  }
}
