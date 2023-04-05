package com.careerit.cj.day18;

interface One{
    void m1();
    String toString();
}
interface Two{
    void m1();
    void m2();
}
interface Three extends  One,Two{
    void m3();
}
class Four implements Three{

  @Override
  public void m1() {

  }

  @Override
  public void m2() {

  }

  @Override
  public void m3() {

  }
  public String toString(){
    return "Hello";
  }
}

public class InterfaceExample {
}
