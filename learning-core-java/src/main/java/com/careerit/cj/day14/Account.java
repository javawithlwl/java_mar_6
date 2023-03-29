package com.careerit.cj.day14;

public class Account {

  private int accNumber;
  private String name;
  private float balance;
  private static String bankName = "SBI";

  public Account(String name, float balance) {
    this.accNumber = AccNumberGenerator.getNewAccNumber();
    this.name = name;
    this.balance = balance;
  }

  public float withdraw(float amount) {
    if (balance >= amount) {
      this.balance -= amount;
    } else {
      System.out.println("Sorry! you don't have enough funds");
    }
    return this.balance;
  }

  public float deposit(float amount) {
    this.balance += amount;
    return this.balance;
  }

  public void showDetails() {
    System.out.println(String.format("%s,%s,%s,%s", accNumber, name, bankName, balance));
  }

  public int getAccNumber() {
    return accNumber;
  }


}
