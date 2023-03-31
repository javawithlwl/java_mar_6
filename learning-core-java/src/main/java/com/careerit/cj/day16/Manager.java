package com.careerit.cj.day16;

class C1 {
  public void m1() {
    System.out.println("m1");
  }
}

class C2 extends C1 {
  public void m2() {
    System.out.println("m2");
  }

}

public class Manager {
  public static void main(String[] args) {
    C1 obj = new C1();
    C2 ref = (C2) obj;
    ref.m2();
    ref.m1();
  }
}
