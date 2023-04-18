package com.careerit.wallet.service;

import com.careerit.wallet.domain.Wallet;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;

public class WalletServiceImpl implements WalletService {

  private List<Wallet> wallets = new ArrayList<>();

  @Override
  public Optional<Wallet> createWallet(Wallet wallet) {
    Optional<Wallet> optWallet = getWallet(wallet.getMobile());
    if (optWallet.isPresent()) {
      return Optional.empty();
    }
    long id = ThreadLocalRandom.current().nextLong(1111, 9999);
    wallet.setId(id);
    wallets.add(wallet);
    return Optional.of(wallet);
  }

  @Override
  public Optional<Wallet> getWallet(String mobile) {
    for (Wallet w : wallets) {
      if (w.getMobile().equals(mobile)) {
        return Optional.of(w);
      }
    }
    return Optional.empty();
  }

  @Override
  public List<Wallet> getAllWallets() {
    return wallets;
  }

  @Override
  public Optional<Wallet> loadAmount(String mobile, double amount) {
    Optional<Wallet> optWallet = getWallet(mobile);
    if (optWallet.isPresent()) {
      Wallet wallet = optWallet.get();
      wallet.setBalance(wallet.getBalance() + amount);
      return Optional.of(wallet);
    }
    return Optional.empty();
  }

  @Override
  public boolean transferAmount(String fromMobile, String toMobile, double amount) {
    Optional<Wallet> optFromWallet = getWallet(fromMobile);
    Optional<Wallet> optToWallet = getWallet(toMobile);
    if (optFromWallet.isPresent() && optToWallet.isPresent()) {
      Wallet fromWallet = optFromWallet.get();
      Wallet toWallet = optToWallet.get();
      if (fromWallet.getBalance() >= amount) {
        fromWallet.setBalance(fromWallet.getBalance() - amount);
        toWallet.setBalance(toWallet.getBalance() + amount);
        return true;
      }
    }
    return false;
  }
}
