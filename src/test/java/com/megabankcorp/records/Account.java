/*
Account
    это простой класс, который находится в пакете com.megabankcorp.records
    содержит
        поле для текущей суммы на счете
        поле для текущего номера счета
        поле для номера клиента банка

    Для суммы используйте тип BigDecimal, для номеров - long
 */

package com.megabankcorp.records;

import java.math.BigDecimal;

public class Account {
    private BigDecimal balance; //поле для текущей суммы на счете
    private long accountNumber; //поле для текущего номера счета
    private long customerNumber; //поле для номера клиента банка

    public Account(BigDecimal balance, long accountNumber, long customerNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.customerNumber = customerNumber;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public long getCustomerNumber() {
        return customerNumber;
    }

    public BigDecimal getBalance() {

        return balance;
    }
}
