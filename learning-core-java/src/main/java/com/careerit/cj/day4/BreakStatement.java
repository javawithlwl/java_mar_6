package com.careerit.cj.day4;

public class BreakStatement {


  public static void main(String[] args) {

      // first n prime numbers
      int n = 100;
      int count = 0;
      for(int i=2;;i++){
          if(isPrime(i)){
            System.out.print(i+" ");
            count++;
          }
          if(count == n){
            break;
          }
      }
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
