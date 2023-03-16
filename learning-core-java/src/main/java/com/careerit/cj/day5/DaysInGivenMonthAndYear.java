package com.careerit.cj.day5;

public class DaysInGivenMonthAndYear {
  public static void main(String[] args) {

    int month = 2;
    int year = 2024;
    int numDays = 0;

    numDays = switch (month) {
      case 1, 3, 5, 7, 8, 10, 12 -> 31;
      case 4, 6, 9, 11 -> 30;
      case 2 -> {
        int num;
        if (((year % 4 == 0) &&
            !(year % 100 == 0))
            || (year % 400 == 0))
          num = 29;
        else
          num = 28;
        yield num;
      }
      default -> {
        System.out.println("Invalid month.");
        yield 0;
      }
    };
    System.out.println("Number of Days = "
        + numDays);
  }
}