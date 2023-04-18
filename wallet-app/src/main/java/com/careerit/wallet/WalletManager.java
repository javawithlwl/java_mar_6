package com.careerit.wallet;

import com.careerit.wallet.domain.Wallet;
import com.careerit.wallet.service.WalletService;
import com.careerit.wallet.service.WalletServiceImpl;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class WalletManager {

  public static void main(String[] args) {

    System.out.println("----- Welcome to Wallet-APP---------");
    Scanner sc = new Scanner(System.in);
    WalletService walletService = new WalletServiceImpl();
    while (true) {
      System.out.println("-".repeat(100));
      System.out.println("1.Create 2.Get Wallet 3.Get All Wallets 4.Load amount 5. Transfer Amount 6.exit");
      System.out.println("-".repeat(100));
      int ch = sc.nextInt();
      sc.nextLine();
      switch (ch) {
        case 1:
          Wallet wallet = getWalletInput();
          Optional<Wallet> optWallet = walletService.createWallet(wallet);
          if(optWallet.isPresent()) {
            System.out.println("Wallet created with id :" + optWallet.get().getId());
          }else{
            System.out.println("Wallet already exists with given mobile number :"+wallet.getMobile());
          }
          break;
        case 2:
          System.out.println("Enter the mobile :");
          String mobile = sc.nextLine();
          Optional<Wallet> opt = walletService.getWallet(mobile);
          if (opt.isPresent()) {
            showWalletDetails(opt.get());
          } else {
            System.out.println("Wallet is not found for the given mobile number " + mobile);
          }
          break;
        case 3:
          List<Wallet> walletList = walletService.getAllWallets();
          if (walletList.isEmpty()) {
            System.out.println("No wallets are created yet... please create wallet");
          } else {
            for (Wallet wallet1 : walletList) {
              showWalletDetails(wallet1);
              System.out.println("-".repeat(100));
            }
          }
          break;
        case 4:
          System.out.println("Enter the mobile number :");
          String toAddMoneyMobile = sc.nextLine();
          System.out.println("Enter the amount ");
          double amount = sc.nextDouble();
          Optional<Wallet> addMoneyWallet = walletService.loadAmount(toAddMoneyMobile, amount);
          if(addMoneyWallet.isPresent()){
              showWalletDetails(addMoneyWallet.get());
          }else{
               System.out.println("Wallet is not found for the given mobile number " + toAddMoneyMobile);
          }
          break;
        case 5:
          System.out.println("Enter the from Mobile: ");
          String fromMobile = sc.nextLine();
          System.out.println("Enter the to mobile : ");
          String toMobile = sc.nextLine();
          System.out.println("Enter the amount :");
          double transferAmount = sc.nextDouble();
          boolean isSuccess = walletService.transferAmount(fromMobile,toMobile,transferAmount);
          if(isSuccess){
            System.out.println(String.format("The amount %s is transferred from %s to %s",transferAmount,fromMobile,toMobile));
          }else{
            System.out.println("Please verify from and to wallets, check balance as well");
          }
          break;
        case 6:
          System.out.println("Thank you");
          System.exit(0);
      }

    }
  }

  private static void showWalletDetails(Wallet wallet) {
    System.out.println(String.format("%s-%s-%s", wallet.getName(), wallet.getMobile(), wallet.getBalance()));
  }

  private static Wallet getWalletInput() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the mobile :");
    String mobile = sc.nextLine();
    System.out.println("Enter the name :");
    String name = sc.nextLine();
    System.out.println("Enter the balance :");
    double balance = sc.nextDouble();
    return Wallet.builder().
        mobile(mobile)
        .name(name)
        .balance(balance)
        .build();
  }
}
