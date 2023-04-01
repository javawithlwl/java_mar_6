package com.careerit.cj.day17;

import java.util.StringJoiner;

class Product {
  private final int id;
  private final String name;
  private final double price;
  private final double discount;

  public Product(int id, String name, double price, double discount) {
    this.id = id;
    this.name = name;
    this.price = price;
    this.discount = discount;
  }

  public Product changePrice(double newPrice) {
    return new Product(id, name, newPrice, discount);
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", Product.class.getSimpleName() + "[", "]")
        .add("id=" + id)
        .add("name='" + name + "'")
        .add("price=" + price)
        .add("discount=" + discount)
        .toString();
  }
}

public class ImmutableClass {

  public static void main(String[] args) {
    Product p = new Product(1, "iPhone", 45000, 10);
    p = p.changePrice(95000);
    System.out.println(p);
  }
}
