package com.careerit.cj.day15;

class T1 {
  static {
    System.out.println("Static from T1");
  }

  T1() {
    super();
    System.out.println("T1");
  }

  {
    System.out.println("IIB T1");
  }
}
class T2 extends  T1{
  static {
    System.out.println("Static from T2");
  }

  T2() {
    super();
    System.out.println("T2");
  }

  {
    System.out.println("IIB T2");
  }
}

public class QuestionManager {

  public static void main(String[] args) {
      T1 obj = new T2();
  }
}
