package com.careerit.wallet.service;

import com.careerit.wallet.domain.Wallet;

import java.util.List;
import java.util.Optional;

public interface WalletService {
    Optional<Wallet> createWallet(Wallet wallet);
    Optional<Wallet> getWallet(String mobile);
    List<Wallet> getAllWallets();
    Optional<Wallet> loadAmount(String mobile,double amount);
    boolean transferAmount(String fromMobile,String toMobile,double amount);
}
