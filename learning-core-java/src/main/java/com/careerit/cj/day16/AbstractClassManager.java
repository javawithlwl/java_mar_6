package com.careerit.cj.day16;

abstract class One {

  void m1() {
    System.out.println("m1");
  }
  public abstract void m2();
}
class Two extends  One{
    void show(){
        m1();
    }
    @Override
    public void m2(){
      System.out.println("Two m2");
    }
}
public class AbstractClassManager {
}
