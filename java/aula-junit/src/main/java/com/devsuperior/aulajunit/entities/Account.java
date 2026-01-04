package com.devsuperior.aulajunit.entities;

import java.io.Serializable;

public class Account implements Serializable {
    private static final long serialVersionUID = 1L;

    public static double DEPOSIT_FEE_PERCENTAGE = 0.02;

    private Long id;
    private Double balance;

    public Account() { }

    public Account(Long id, Double balance) {
        this.id = id;
        this.balance = balance;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            amount -=  amount * DEPOSIT_FEE_PERCENTAGE;
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException();
        }
        balance -= amount;
    }

    public double fullWithdraw() {
        double aux = balance;
        balance = 0.0;
        return aux;
    }

}
