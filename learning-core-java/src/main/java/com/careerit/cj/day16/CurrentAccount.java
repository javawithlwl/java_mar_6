package com.careerit.cj.day16;

public class CurrentAccount extends Account {

  double overDraft;

  public CurrentAccount(Long accNum, String name, double balance, double overDraft) {
    super(accNum, name, balance);
    this.overDraft = overDraft;
  }

  @Override
  public double withdraw(double amount) {
    if (balance >= (amount + overDraft)) {
      this.balance -= amount;
    } else {
      System.out.println("Sorry! you don't have enough funds");
    }
    return this.balance;
  }

  public void showMoreDetails(){
    System.out.println(String.format("%s,%s,%s,%s",accNumber,name,balance,overDraft));
  }
}
