package com.careerit.cj.day12;

class Demo{
    static{
      System.out.println("Static block");
    }
    public static int count = 10;
    public Demo(){
      System.out.println("Constructor");
    }

}
public class StaticBlockExample {

  public static void main(String[] args) {


    System.out.println("Hello");
    Demo demo1 = new Demo();
    Demo demo2 = new Demo();
    System.out.println(Demo.count);
    System.out.println(Demo.count);

  }
  static class  Inner{

  }
}
