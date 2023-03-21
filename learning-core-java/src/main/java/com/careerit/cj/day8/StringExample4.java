package com.careerit.cj.day8;

public class StringExample4 {

  public static void main(String[] args) {

     String data = "krish, Manoj,Rajesh, jayesh, suresh";

     String[] arr = data.split(",");
     for(String name:arr){
       name = name.trim();
       System.out.println(name.substring(0,1).toUpperCase().concat(name.substring(1)));
     }

  }

  private static boolean isPalindrome(String str) {
//    int l = str.length();
//    for (int i = 0, j = l - 1; i <= j; i++, j--) {
//      if (str.charAt(i) != str.charAt(j)) {
//        return false;
//      }
//    }
//    return true;
    return new StringBuilder(str).reverse().toString().equals(str);
  }

  private static int countVowels(String str) {
    return 0;
  }
}
