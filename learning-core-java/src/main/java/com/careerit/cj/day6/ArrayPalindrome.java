package com.careerit.cj.day6;

public class ArrayPalindrome {

  public static void main(String[] args) {

    int[] arr = new int[]{1, 2, 3, 4, 5, 2, 1};

    boolean flag = true;
    for (int i = 0, j = arr.length-1; i <= j; i++, j--) {
        if(arr[i]!=arr[j]){
            flag = false;
            break;
        }
    }
    if(flag){
      System.out.println("Palindrome");
    }else {
      System.out.println("Not Palindrome");
    }
  }
}
