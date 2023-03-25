package com.careerit.cj.day12;

public class CommandLineArguments {

  public final static void main(final String... args) {
    System.out.println(args.length);
    int empno = Integer.parseInt(args[0]);
    String name = args[1];
    int age = Integer.parseInt(args[2]);
    System.out.println(String.format("%s,%s,%s",empno,name,age));
  }
}
