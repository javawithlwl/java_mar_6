package com.careerit.cj.day2;

import java.util.Scanner;

public class BiggestOfTwoNumbers {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the num1 :");
    int num1 = sc.nextInt();
    System.out.println("Enter the num2 :");
    int num2 = sc.nextInt();
    int biggest;
    if(num1 > num2){
        biggest = num1;
    }else{
        biggest = num2;
    }
    System.out.println("The biggest of "+num1+" and "+num2+" is "+biggest);

  }
}
