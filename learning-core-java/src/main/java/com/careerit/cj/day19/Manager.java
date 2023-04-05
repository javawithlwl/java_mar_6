package com.careerit.cj.day19;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

interface MyPredicate {
  boolean test(Integer obj);
}

class UserDetails {
  private List<Integer> userAgeList = List.of(23, 18, 19, 15, 14, 25, 35, 45, 55, 54, 34, 26, 50);
  public List<Integer> ageFilter(MyPredicate myPredicate) {
    List<Integer> filteredList = new ArrayList<>();
    for (int ele : userAgeList) {
      if (myPredicate.test(ele)) {
        filteredList.add(ele);
      }
    }
    return filteredList;
  }

}

interface MathOperations{
      double perform(double a,double b);
}

public class Manager {

  public static void main(String[] args) {
    UserDetails obj = new UserDetails();
    List<Integer> list = obj.ageFilter((age)-> age >=30 && age <=50 );
    System.out.println(list);
    List<Integer> list2 = obj.ageFilter((age)-> age >= 50 );
    System.out.println(list2);

    MathOperations add = (num1,num2)-> {
      double res = num1 + num2;
      System.out.println(String.format("The sum of %s and %s is %s",num1,num2,res));
      return res;
    };
    MathOperations mul = (num1,num2)-> num1 * num2;

    Consumer<String> consumer = (ele)->System.out.println(ele);


    System.out.println(perform(24,21,(a,b)->a+b));
    System.out.println(perform(24,21,(a,b)->a*b));
    System.out.println(perform(24,21,(a,b)->a-b));

  }
  public static double perform(double a, double b, BinaryOperator<Double> binaryOperator){
        return binaryOperator.apply(a,b);
  }
}
