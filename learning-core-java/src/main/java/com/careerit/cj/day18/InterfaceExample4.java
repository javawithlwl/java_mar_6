package com.careerit.cj.day18;

import java.util.List;

interface I1 {
      double perform(double a,double b);
}
class C1 implements  I1{

  @Override
  public double perform(double a, double b) {
    return a + b;
  }
}
class C2 implements  I1{

  @Override
  public double perform(double a, double b) {
    return a * b;
  }
}
class C3 implements  I1{

  @Override
  public double perform(double a, double b) {
    return a > b ? a:b;
  }
}
class MathOperation{

      public double result(List<Integer> list, I1 obj){
            double res = list.get(0);
            for(int i=1;i<list.size();i++){
                res = obj.perform(res,list.get(i));
            }
            return res;
      }

}

public class InterfaceExample4 {

  public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6);
        MathOperation obj = new MathOperation();
        double res=obj.result(list,(a,b)->a<b?a:b);
       System.out.println(res);
  }
}
