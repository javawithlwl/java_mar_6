package com.careerit.cj.day16;

public class TypeCastingExample {

  public static void main(String[] args) {

    Object[] arr = new Object[]{123, "Hi", "Hello", "John", "mahesh", 345, "Suresh"};

    for (Object obj : arr) {
      if(obj instanceof  String) {
        String name = (String) obj;
        System.out.println(name.toUpperCase());
      }
    }

  }
}
