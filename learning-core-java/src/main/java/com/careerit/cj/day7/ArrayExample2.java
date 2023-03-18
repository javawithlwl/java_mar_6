package com.careerit.cj.day7;

public class ArrayExample2 {

  public static void main(String[] args) {

    int[][] arr = new int[][]{
        {1, 2, 3, 4},
        {2, 3, 4, 5},
        {5, 6, 7, 8}
    };

    for (int i = 0; i < arr.length; i++) {

      for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println("For each");
    for(int[] temp:arr){
        for(int ele:temp){
          System.out.print(ele+" ");
        }
      System.out.println();
    }

  }
}
