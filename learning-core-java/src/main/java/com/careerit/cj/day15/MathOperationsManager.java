package com.careerit.cj.day15;
class C1{
      int a = 100;
      int sub(int a,int b){
          return a - b;
      }
      int add(int a,int b){
        return a + b;
      }
      public void show(){
        System.out.println(a);
      }

}
class C2 extends  C1{
  int a = 999;
  @Override
  protected int sub(int a,int b){
        return  (a>b)?a-b:b-a;
  }
  public void show(){
    System.out.println(a);
    super.show();
  }

}
public class MathOperationsManager {
  public static void main(String[] args) {

        C1 obj = new C2();
        System.out.println(obj.add(5,10));
        System.out.println(obj.sub(5,10));
        System.out.println(obj.a);

  }
}
