package com.careerit.cj.day13;

class One {
  private static int count = 0;

  public One(int a) {

  }

  public One(int a, int b) {

  }

  public One(int a, int b, int c) {

  }

  {
    count++;
  }

  public static int getCount() {
    return count;
  }

}

public class Manager {

  public static void main(String[] args) {
    System.out.println(One.getCount());
    One obj1 = new One(10);
    One obj2 = new One(10, 20);
    One obj3 = new One(10, 20, 30);
    One obj4 = new One(10);
    System.out.println(One.getCount());
  }
}
