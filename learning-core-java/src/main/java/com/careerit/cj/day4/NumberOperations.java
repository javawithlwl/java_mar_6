package com.careerit.cj.day4;

public class NumberOperations {

  public static void main(String[] args) {
    int num = 98789;
    int revNum = reverse(num);
    System.out.println(num + " reverse num is :" + revNum);
    if(isPalindrome(num)){
      System.out.println(num +" is palindrome");
    }else{
      System.out.println(num+" is not a palindrome");
    }


  }

  private static int reverse(int num) {
    int rev = 0;
    while (num != 0) {
      int r = num % 10;
      rev = rev * 10 + r;
      ;
      num = num / 10;
    }
    return rev;
  }

  private static int sumOfDigits(int num) {
    return 0;
  }

  private static boolean isPalindrome(int num) {
      return reverse(num) == num;
  }

  private static boolean isArmstrong(int num) {
    return false;
  }

  private static int sumOfDigitsUntilSingleSumSingleDigit(int num) {
    return 0;
  }

  private static int countPrimeInRange(int lb, int ub) {
    return 0;
  }
}
