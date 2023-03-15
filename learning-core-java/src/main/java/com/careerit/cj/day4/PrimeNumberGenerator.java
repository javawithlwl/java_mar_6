package com.careerit.cj.day4;

public class PrimeNumberGenerator {

  public static void main(String[] args) {

    int lb = 10, ub = 50;
    int primeCount = 0;
    for (int i = lb; i <= ub; i++) {
          if(isPrime(i)){
            System.out.print(i+" ");
            primeCount++;
          }
    }
    System.out.println("\nPrime number between "+lb+" and "+ub+" count is :"+primeCount);

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
