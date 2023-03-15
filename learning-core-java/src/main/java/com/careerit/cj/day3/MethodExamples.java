package com.careerit.cj.day3;

public class MethodExamples {

  public static void main(String[] args) {

      // Print first n even numbers
      int n = 10;
      for(int i=1;i<=n;i++){
          if(isEven(i)){
            System.out.println(i);
          }
      }
    System.out.println(Math.sqrt(9));
    System.out.println(Math.pow(2,3));

  }

  public static boolean isEven(int num){
      return num % 2 == 0;
  }
  public static boolean isPrime(int num){
      return false;
  }
  public static int factorial(int num){
    return 0;
  }
  public static int primeCount(int lb,int ub){
    return 0;
  }
  public static int biggest(int a,int b,int c){
      return 0;
  }
  public static void showFibonacciSeries(int n){
      // Logic to show values
  }
}
