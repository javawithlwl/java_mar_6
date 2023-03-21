package com.careerit.cj.day8;

import java.util.Arrays;

public class StringExample6 {

  public static void main(String[] args) {

    System.out.println(isAnagram("cat","act"));
    System.out.println(isAnagram("caat","acit"));
    System.out.println(isAnagram("cata","acta"));

  }
  private static void createSubStrings(String str,int size){

  }
  private static boolean isAnagram(String str1, String str2) {
    if (str1.length() != str2.length()) {
      return false;
    }
    char[] w1 = str1.toCharArray();
    char[] w2 = str2.toCharArray();
    Arrays.sort(w1);
    Arrays.sort(w2);
    return Arrays.equals(w1, w2);
  }
}
