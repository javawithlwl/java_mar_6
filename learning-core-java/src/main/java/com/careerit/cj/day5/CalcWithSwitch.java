package com.careerit.cj.day5;

import java.util.Scanner;

public class CalcWithSwitch {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the num1 :");
    int num1 = sc.nextInt();
    System.out.println("Enter the num2 :");
    int num2 = sc.nextInt();
    System.out.println("1.Add 2.Sub 3.Mul 4.Div 5.Exit");
    System.out.println("Enter the choice :");
    int ch = sc.nextInt();
    String operator = "";
    int res = 0;
    switch (ch) {
      case 1:
        operator = "+";
        res = num1 + num2;
        break;
      case 2:
        operator = "-";
        res = num1 - num2;
        break;
      case 3:
        operator = "*";
        res = num1 * num2;
        break;
      case 4:
        operator = "/";
        res = num1 / num2;
        break;
      case 5:
         System.exit(0);
      default:
        operator = "Invalid operator";
    }

    System.out.println(num1 + " " + operator + " " + num2 + " = " + res);
  }

}
