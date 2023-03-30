package com.careerit.cj.day15;

class Product extends Object {
  int pid;
  String name;
  double price;

  public Product(int pid, String name, double price) {
    this.pid = pid;
    this.name = name;
    this.price = price;
  }
  @Override
  public String toString(){
       return String.format("%s,%s,%s",pid,name,price);
  }

}

public class Manager {

  public static void main(String[] args) {
    Product product = new Product(1001, "iPhone15", 120000);
    System.out.println(Integer.toHexString(product.hashCode()));
    System.out.println(product.getClass());
    System.out.println(product.toString());
    System.out.println(product);

  }
}
