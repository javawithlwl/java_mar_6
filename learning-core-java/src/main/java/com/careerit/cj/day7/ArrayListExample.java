package com.careerit.cj.day7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListExample {
  public static void main(String[] args) {

    List<Integer> arr = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    int c = 0;
    while (true) {
      System.out.println("*".repeat(50) + "\n1.add 2.delete 3.update \n" + "*".repeat(50));
      System.out.println("Enter your choice: ");
      int ch = sc.nextInt();
      System.out.println(arr);
      switch (ch) {
        case 1:
          System.out.println("Enter the num :");
          int num = sc.nextInt();
          arr.add(num);
          break;
        case 2:
          System.out.println("Enter the num to delete:");
          int dnum = sc.nextInt();
          int index = arr.indexOf(dnum);
          if(index!=-1){
              arr.remove(index);
          }
          break;
        case 3:
          System.out.println("Enter the num to update:");
          int unum = sc.nextInt();
          int ind = arr.indexOf(unum);
          if(ind!=-1){
            System.out.println("Enter the updated value :");
            int updatedNum = sc.nextInt();
            arr.set(ind,updatedNum);
          }
          break;
        default:
          System.out.println("Wrong choice... please enter 1-3 only");
      }
      System.out.println("Do you want continue ? enter 1 to continue ");
      int choice = sc.nextInt();
      if (choice != 1) {
        break;
      }
    }

  }





}
