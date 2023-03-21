package com.careerit.cj.day8;

public class StringBuilderExample {

  public static void main(String[] args) {

    StringBuilder sb = new StringBuilder("Core Java");
    sb.append(" learning is fun!");
    System.out.println(sb);
    String name = "Krish";
    int age = 25;
    double salary = 5000;
    String company="Wipro";
    StringBuilder sb1 = new StringBuilder();
    String data = sb1.append(name).append(",").append(age).append(",").append(salary).append(",").append(company).toString();
    System.out.println(data);
    String str1 = "liril";

    boolean res = new StringBuilder(str1).reverse().toString().equals(str1);
    System.out.println(res);

  }
}
