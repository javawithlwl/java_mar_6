package com.careerit.cj.day9;


public class Account {

  private String accNum;
  private String name;
  private double balance;

  public Account(String accNum, String name, double balance) {
    this.accNum = accNum;
    this.name = name;
    this.balance = balance;
  }

  public void deposit(double amount) {
    balance += amount;
    String message = String.format("Hi %s name, your account %s is credited with amount %s and balance is %s",name,maskAccNumber(accNum),amount,balance);
    System.out.println(message);
  }

  public void withdraw(double amount) {
    if (balance >= amount) {
      balance -= amount;
      String message = String.format("Hi %s name, your account %s is debited with amount %s and balance is %s",name,maskAccNumber(accNum),amount,balance);
      System.out.println(message);
    } else {
      System.out.println("You don't have sufficient funds. Your balance is :" + balance);
    }
  }

  public void showDetails() {
    System.out.println("Account number :" + maskAccNumber(accNum));
    System.out.println("Name           :" + name);
    System.out.println("Balance        :" + balance);
  }

  private String maskAccNumber(String accNum){

        if(accNum!=null && accNum.length() > 4){
            return "********"+accNum.substring(accNum.length()-4);
        }
        return accNum;
  }

  public String getAccNum() {
    return accNum;
  }

  public void setAccNum(String accNum) {
    this.accNum = accNum;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }
}
