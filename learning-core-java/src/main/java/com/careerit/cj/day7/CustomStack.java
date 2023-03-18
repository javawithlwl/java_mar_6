package com.careerit.cj.day7;


import java.util.Scanner;

public class CustomStack {

  public static void main(String[] args) {

    int[] arr = new int[3];
    Scanner sc = new Scanner(System.in);
    int c = 0;
    while (true) {
      System.out.println("*".repeat(50) + "\n1.add 2.delete 3.update \n" + "*".repeat(50));
      System.out.println("Enter your choice: ");
      int ch = sc.nextInt();
      if(c == 0){
        System.out.println("[]");
      }else{
        showElements(arr,c);
      }
      switch (ch) {
        case 1:
          System.out.println("Enter the num :");
          int num = sc.nextInt();
          if(c == arr.length-1){
              int[] tmp = new int[2 * arr.length];
              System.arraycopy(arr,0,tmp,0,arr.length);
              arr = tmp;
          }
          arr[c++] = num;
          break;
        case 2:
          System.out.println("Enter the num to delete:");
          int dnum = sc.nextInt();
          //Logic
          break;
        case 3:
          System.out.println("Enter the num to update:");
          int unum = sc.nextInt();
          int index = indexOf(arr,unum);
          if(index!=-1){
            System.out.println("Enter the update value: ");
            int uvalue = sc.nextInt();
            arr[index] = uvalue;
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

  private static int indexOf(int[] arr, int unum) {

      return -1;
  }

  private static void showElements(int[] arr, int c) {

        String str = "[";
        for(int i=0;i< c;i++){
            str += " "+arr[i]+",";
        }
        str = str.trim().substring(0,str.length()-1);
        str +="]";
    System.out.println(str);
  }

}
