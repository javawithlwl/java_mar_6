package com.careerit.cj.day13;

class Parent extends  Object {

  public Parent() {
     System.out.println("Parent Constructor");
  }

  {
    System.out.println("IIB-Parent");
  }

}

class Two extends  Parent {
  static {
    System.out.println("Static block-1");
  }

  Two() {
     System.out.println("Constructor");
  }

  {
    System.out.println("IIB");
  }

  static {
    System.out.println("Static Block-2");
  }
}

public class IIBExample {
  public static void main(String[] args) {
    Two obj1 = new Two();
  }
}
