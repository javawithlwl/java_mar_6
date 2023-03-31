package com.careerit.cj.day16;

public class SavingAccount extends Account {

  double minBalance;

  public SavingAccount(Long accNum, String name, double balance, double minBalance) {
    super(accNum, name, balance);
    this.minBalance = minBalance;
  }

  @Override
  public double withdraw(double amount) {
    if (balance >= (amount - minBalance)) {
      this.balance -= amount;
    } else {
      System.out.println("Sorry! you don't have enough funds");
    }
    return this.balance;
  }
}
