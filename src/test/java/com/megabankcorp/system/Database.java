package com.megabankcorp.system;

import com.megabankcorp.records.Account;

import java.math.BigDecimal;

public abstract class Database {

    public abstract void deposit(Account account, BigDecimal amount);

    public abstract void withdraw(Account account, BigDecimal amount);

    public abstract BigDecimal getAmount(Account account);

    void transfer(Account from, Account to, BigDecimal amount) {
        BigDecimal fromAmount = getAmount(from);
        if (fromAmount.compareTo(amount) < 0) {
            System.out.println("Недостаточно средств");
        }
        withdraw(from, amount);
        deposit(to, amount);
    }
}
