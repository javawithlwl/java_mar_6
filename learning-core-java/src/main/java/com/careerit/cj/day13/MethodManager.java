package com.careerit.cj.day13;

class MyMath {

  public int add(int a, int b) {
    return a + b;
  }

  public int add(char a, char b) {
    return a + b;
  }

  public int add(int a, int b, int c) {
    return a + b + c;
  }

  public int add(int... a) {
    int res = 0;
    for (int i : a) {
      res += i;
    }
    return res;
  }

  public int getPostIncValue(int a) {
    return a++;
  }

  public int getPreIncValue(int a) {
    return ++a;
  }

}


public class MethodManager {

  public static void main(String... args) {
    MyMath obj = new MyMath();
    obj.add(1, 3);
    obj.add(1, 2, 3);
    obj.add(1);
    obj.add(1, 2, 3, 4, 5, 6);
    obj.add('a', 'b');

    int a = 10;
    System.out.println(obj.getPostIncValue(a));
    System.out.println(obj.getPreIncValue(a));

    int x = 5;
    int res = x++ + x++;
    System.out.println(res);
    System.out.println(x);

    int num = 3;
    switch (++num){
      case 3:
        System.out.println("3");
        break;
      case 4:
        System.out.println("4");
        break;
      default:
        System.out.println("Other");
    }
  }
}
