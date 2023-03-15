package com.careerit.cj.day4;

public class NestedForExample {
  public static void main(String[] args) {
    int n = 3, m = 3;
    for (int i = 0; i <= n; i++) {
        for(int j=0;j<= m;j++){
          System.out.print(i+""+j+" ");
        }
      System.out.println();
    }
  }
}
