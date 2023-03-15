package com.careerit.cj.day4;

public class ContinueStatement {

  public static void main(String[] args) {

    for (int i = 1; i <= 10; i++) {
      if(i % 3 == 0){
          continue;
      }
      System.out.print(i + " ");
    }
  }
}
