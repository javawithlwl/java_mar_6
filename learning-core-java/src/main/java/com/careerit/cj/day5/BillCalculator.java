package com.careerit.cj.day5;

import java.util.Scanner;

public class BillCalculator {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the day name (mon,tue,wed,thu,fri,sat,sun)");
    String dname = sc.next();
    System.out.println("Enter the bill amount :");
    float billAmount = sc.nextFloat();
    float discount = 0;
    switch (dname){
      case "mon":
      case "wed":
      case "thu": discount = billAmount * 0.05f;
                  break;
      case "tue": discount = billAmount * 0.20f;
        break;
      case "fri":discount = billAmount * 0.10f;
        break;
      case "sat":
      case "sun":
        discount = -billAmount * 0.10f;
        break;
      default:
        System.out.println("Invalid day name is entered");
    }
    float netAmount = billAmount - discount;
    System.out.println("Bill Amount :"+billAmount);
    System.out.println("Discount    :"+discount);
    System.out.println("Net amount  :"+netAmount);
  }
}
