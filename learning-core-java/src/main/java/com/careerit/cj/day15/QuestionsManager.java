package com.careerit.cj.day15;
class A1{

      void show(){
        System.out.println("A1");
      }
}
class A2 extends  A1{

    void show(){
      super.show();
      System.out.println("A2");
    }
}
class A3 extends A2{
    void show(){
      System.out.println("A3");
    }
    void display(){
        show();
        super.show();
    }
}
public class QuestionsManager {

  public static void main(String[] args) {

        A3 obj = new A3();
        obj.display();
  }
}
