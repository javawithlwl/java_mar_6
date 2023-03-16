package com.careerit.cj.day5;

import java.util.ArrayList;
import java.util.List;

public class BreakContinueReturn {

  // Break, Continue, Return

  public void showValues(List<Integer> list) {
    // skip all number which divisible by 3
    for (int i : list) {
      if (i % 3 == 0) {
        continue;
      }
      System.out.println(i);
    }
  }

  public List<Integer> generatePrime(int n) {
    List<Integer> list = new ArrayList<>();

    for (int i = 2; ; i++) {
      if (list.size() == n) {
        break;
      }
      if (isPrime(i)) {
        list.add(i);
      }
    }
    return list;
  }

  public static boolean isPrime(int num) {
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
