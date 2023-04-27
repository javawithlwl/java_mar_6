package com.careerit.cj.other;

import java.lang.reflect.Method;

public class ReflectionApi {

  public static void main(String[] args) {

        String str = "Hello";

    Method[] methods = str.getClass().getDeclaredMethods();
    for(Method method:methods){
      System.out.println(method.getName()+" "+method.getReturnType());
    }
    System.out.println(str.getClass().getSuperclass());
    Class<?>[] arr = str.getClass().getInterfaces();
    for(Class c:arr){
      System.out.println(c);
    }
  }

}
