package com.careerit.cj.day12;

import java.io.PrintStream;
import java.io.PrintWriter;

class MyMath {

  private MyMath() {
  }

  public static int biggest(int a, int b) {
    return a > b ? a : b;
  }
  //
}
class Mahi{
    public static PrintStream out = System.out;
}

public class MathManager {

  public static void main(String[] args) {

        int big=MyMath.biggest(1,3);
        Mahi.out.print("Hello");
  }

}
