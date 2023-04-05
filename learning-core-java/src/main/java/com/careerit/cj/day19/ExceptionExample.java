package com.careerit.cj.day19;

import java.util.Scanner;

public class ExceptionExample {

  public static void main(String[] args) {
    System.out.println("Start of Main");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the num1 :");
    int num1 = sc.nextInt();
    System.out.println("Enter the num2 :");
    int num2 = sc.nextInt();
    try {
      int res = num1 / num2;
      System.out.println(String.format("%s / %s = %s", num1, num2, res));
    }catch (ArithmeticException e){
      System.out.println("Value num2 can't zero, exception "+e);
    }
    System.out.println("End of Main");
  }
}
