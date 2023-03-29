package com.careerit.cj.day14;

import java.util.ArrayList;
import java.util.List;

public class AccountService {

  private List<Account> accList;

  public AccountService() {
    accList = new ArrayList<>();
  }

  public void createAccount(String name, float balance) {
    Account account = new Account(name, balance);
    accList.add(account);
    System.out.println("Account created with number:" + account.getAccNumber());
  }

  public void withdrawAmount(int accNumber, float amount) {
    Account account = getAccount(accNumber);
    if (account != null) {
      float balance = account.withdraw(amount);
      System.out.println(String.format("Account %s has balance %s",accNumber,balance));
    } else {
      System.out.println("Account number " + accNumber + " is not exists");
    }
  }
  public void deposit(int accNumber, float amount){
    Account account = getAccount(accNumber);
    if (account != null) {
      float balance = account.deposit(amount);
      System.out.println(String.format("Account %s has balance %s",accNumber,balance));
    } else {
      System.out.println("Account number " + accNumber + " is not exists");
    }
  }
  public void showDetails(int accNumber){
    Account account = getAccount(accNumber);
    if (account != null) {
        account.showDetails();
    } else {
      System.out.println("Account number " + accNumber + " is not exists");
    }
  }
  public void showAllAccountDetails(){
      if(accList.isEmpty()){
        System.out.println("Not yet account are created, please create account to see details");
      }else{
        for(Account acc:accList){
            acc.showDetails();
        }
      }
  }

  private Account getAccount(int accNumber) {
    for (Account acc : accList) {
      if (acc.getAccNumber() == accNumber) {
        return acc;
      }
    }
    return null;
  }

}
