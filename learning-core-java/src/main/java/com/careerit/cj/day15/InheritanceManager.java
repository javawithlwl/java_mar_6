package com.careerit.cj.day15;

class One{
    One(int a,int b){
      super();
      System.out.println("one");
    }
}
class Two extends  One{
    Two(int a){
       super(a,20);
       System.out.println("two");
    }
}
class Three extends  Two{
    Three(){
       super(10);
       System.out.println("three");
    }
}
public class InheritanceManager {

  public static void main(String[] args) {

        Three obj = new Three();
  }
}
