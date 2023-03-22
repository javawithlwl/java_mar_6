package com.careerit.cj.day9;

import java.util.List;

public class AccountManager {

  public static void main(String[] args) {

    Account acc1 = new Account("30363942899","Krish",5000);
    Account acc2 = new Account("30363952199","Manoj",55000);
    Account acc3 = new Account("30363942299","Charan",55000);
    Account acc4 = new Account("30363972499","Rama Krishna",25000);
    Account acc5 = new Account("30363962699","Rajesh Babu",15000);

    List<Account> list = List.of(acc1,acc2,acc3,acc4,acc5);

    double totalBalance = 0;
    for(Account acc:list){
        totalBalance += acc.balance;
    }
    // Display max balance customer(s) details
    double maxAmount = list.get(0).balance;
    for(Account acc:list){
        if(maxAmount < acc.balance){
            maxAmount = acc.balance;
        }
    }
    System.out.println("Max balance customer details: (max amount is "+maxAmount+")");
    for(Account acc:list){
        if(acc.balance == maxAmount){
            acc.showDetails();
            System.out.println("-".repeat(100));
        }
    }

  }
}
