package com.devsuperior.aulajunit.entities;

import com.devsuperior.aulajunit.factories.AccountFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AccountTests {

    @Test
    public void depositShouldIncreaseBalanceAndDiscountFeeWhenPositiveAmount() {
        // Arrange
        double amount = 200.0;
        double expectedValue = 196.0;
        Account account = AccountFactory.createEmpytAccount();

        // Act
        account.deposit(amount);

        // Assert
        assertEquals(expectedValue, account.getBalance());
    }

    @Test
    public void depositShouldDoNothingWhenNegativeAmount() {
        // Arrange
        double expectedValue = 100.0;
        Account account = AccountFactory.createAccount(expectedValue);
        double amount = -200.0;

        // Act
        account.deposit(amount);

        // Assert
        assertEquals(expectedValue, account.getBalance());
    }

    @Test
    public void withdrawShouldDecreaseBalanceWhenSufficientBalance() {
        // Arrange
        Account account = AccountFactory.createAccount(800.0);

        // Act
        account.withdraw(500.0);

        // Assert
        assertEquals(300.0, account.getBalance());
    }

    @Test
    public void withdrawShouldThrowExceptionWhenInsufficientBalance() {
        // Assert
        assertThrows(IllegalArgumentException.class, () -> {
            // Arrange
            Account account = AccountFactory.createAccount(800.0);

            // Act
            account.withdraw(801.0);
        });
    }

    @Test
    public void fullWithdrawShouldClearBalanceAndReturnFullBalance() {
        // Arrange
        double expectedValue = 0.0;
        double initialBalance = 800.0;
        Account account = AccountFactory.createAccount(initialBalance);

        // Act
        double result = account.fullWithdraw();

        // Assert
        assertEquals(expectedValue, account.getBalance());
        assertEquals(result, initialBalance);
    }

}
