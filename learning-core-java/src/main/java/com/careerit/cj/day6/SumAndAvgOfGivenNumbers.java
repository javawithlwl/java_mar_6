package com.careerit.cj.day6;

public class SumAndAvgOfGivenNumbers {

  public static void main(String[] args) {

    int[] arr = new int[]{10, 20, 30, 40, 59};

    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }

    for (int i = arr.length - 1; i >= 0; i--) {
      System.out.println(arr[i]);
    }

    // Get last three elements

    for(int i=arr.length-3;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
    for(int ele:arr){
      System.out.println(ele);
    }

    int sum = 0;
    for(int i:arr){
        sum += i;
    }
//    for(int i=0;i<arr.length;i++){
//        sum += arr[i];
//    }
    System.out.println(sum);
    float avg = sum /(float)arr.length;
    System.out.println(avg);
  }

}
