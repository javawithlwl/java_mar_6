package com.careerit.cj.day15;
class M1{
    public void m1(){
      System.out.println("m1");
    }
}
class M2 extends  M1{

    public void m1(){
      System.out.println("m2-m1");
    }
    public void m1(int a){
      System.out.println("m2-"+a);
    }
    public void m2(){
      System.out.println("m2-m2");
    }
}
public class Example1 {

  public static void main(String[] args) {
        M1 obj = new M2();

        if(obj instanceof M2 m2){
            m2.m1();
            m2.m1(10);
            m2.m2();
        }

  }
}
