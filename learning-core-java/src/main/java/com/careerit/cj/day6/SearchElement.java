package com.careerit.cj.day6;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class SearchElement {

  public static void main(String[] args) {

    int[] arr = getElements(20);
    System.out.println(Arrays.toString(arr));
    int key = 8;
    int index = search(arr, key);
    if (index != -1) {
      System.out.println("Element " + key + " present at index " + index);
    } else {
      System.out.println("Element " + key + " is not found");
    }

  }
  private static int[] generatePrimeNumbers(int n){

    return null;
  }
  private static int[] generatePrime(int lb,int ub){

    return null;
  }

  public static int biggest(int[] arr) {
    int big = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (big < arr[i]) {
        big = arr[i];
      }
    }
    return big;
  }

  public static int smallest(int[] arr) {

    return 0;
  }

  public static boolean search(int[] arr, int a, int b, int c) {
    return search(arr, a) != -1 && search(arr, b) != -1 && search(arr, c) != -1;
  }

  public static int search(int[] arr, int key) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == key) {
        return i;
      }
    }
    return -1;
  }

  public static int[] getElements(int n) {
    int[] arr = new int[n];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = ThreadLocalRandom.current().nextInt(1, n + 1);
    }
    return arr;
  }
}
