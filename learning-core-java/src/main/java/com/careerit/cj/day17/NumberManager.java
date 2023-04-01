package com.careerit.cj.day17;

import java.util.ArrayList;
import java.util.List;

abstract class NumberOperations {
  public NumberOperations(){
    System.out.println("1");
  }
  public List<Integer> generatePrimes(int lb, int ub) {
    List<Integer> list = new ArrayList<>();
    for (int i = lb; i <= ub; i++) {
      if (isPrime(i)) {
        list.add(i);
      }
    }
    return list;
  }

  abstract boolean isPrime(int num);
}

class MyPrimeGenerator extends NumberOperations {

  public MyPrimeGenerator(){
    System.out.println("2");
  }
  @Override
  boolean isPrime(int num) {
    if (num < 2 || (num % 2 == 0 && num != 2)) {
      return false;
    }
    for (int i = 2; i <= num / 2; i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }
}

public class NumberManager {

  public static void main(String[] args) {
    NumberOperations obj = new MyPrimeGenerator();
    List<Integer> list = obj.generatePrimes(1, 100);
    System.out.println(list);
  }

}
