package com.careerit.cj.day5;

import java.util.Scanner;

public class DayName {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the day number :");
    int num = sc.nextInt();
    String dayName = switch (num) {
      case 1 -> {
        System.out.println("Day num:"+num);
        yield  "Monday";
      }
      case 2 -> "";
      case 3 -> "";
      case 4 -> "";
      case 5 -> "";
      case 6 -> "";
      case 7 -> "";
      default -> "Invalid day";
    };

    System.out.println(num + " => " + dayName);


  }
}
