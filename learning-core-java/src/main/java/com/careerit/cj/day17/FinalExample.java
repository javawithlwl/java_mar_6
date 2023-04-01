package com.careerit.cj.day17;

final class One {
  void m1() {

  }

  void m2() {
  }

}

class Two {

}

class T1 {
  void m1() {

  }

  final void m2() {

  }
}

class T2 extends T1 {
  @Override
  void m1() {
    System.out.println("T2 M1");
  }

}

class Person {
  final int age;

  Person() {
    this.age = 30;
  }

  Person(int age) {
    this.age = age;
  }

}

class Planet {
  public static final double G = 6.67300E-11;
  private final double mass;
  private final double radius;

  public Planet(double mass, double radius) {
    this.mass = mass;
    this.radius = radius;
  }

  double surfaceGravity() {
    return G * mass / (radius * radius);
  }

  double surfaceWeight(double otherMass) {
    return otherMass * surfaceGravity();
  }
}

public class FinalExample {
  public final static void main(final String[] args) {

    final Planet MERCURY = new Planet(3.303e+23, 2.4397e6);
    final Planet VENUS = new Planet(4.869e+24, 6.0518e6);
    final Planet EARTH = new Planet(5.976e+24, 6.37814e6);
    final Planet MARS = new Planet(6.421e+23, 3.3972e6);

    double weight = 60;
    double mass = weight/EARTH.surfaceGravity();
    System.out.println(MERCURY.surfaceWeight(mass));
    System.out.println(EARTH.surfaceWeight(mass));
    System.out.println(MARS.surfaceWeight(mass));
  }
}
