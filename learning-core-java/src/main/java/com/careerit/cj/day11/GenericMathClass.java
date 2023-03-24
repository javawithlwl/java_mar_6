package com.careerit.cj.day11;

public class GenericMathClass {

  public int big(int a, int b) {
    return a > b ? a : b;
  }

  public int small(int a, int b) {
    return a < b ? a : b;
  }

  public int maxElement(int[] arr) {
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
      max = small(max, arr[i]);
    }
    return max;
  }

  public static void main(String[] args) {
    GenericMathClass obj = new GenericMathClass();
    int[] arr = new int[]{1, 2, 3, 4, 8, 9, 10};
    int max = obj.maxElement(arr);
  }

}
