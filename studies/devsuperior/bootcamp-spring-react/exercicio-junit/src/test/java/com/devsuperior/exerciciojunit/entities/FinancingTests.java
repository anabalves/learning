package com.devsuperior.exerciciojunit.entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FinancingTests {

    @Test
    public void constructorShouldCreateObjectWhenValidData() {
        // Arrange
        // Act
        Financing financing = new Financing(100000.0, 2000.0, 80);

        // Assert
        assertEquals(100000.0, financing.getTotalAmount());
        assertEquals(2000.0, financing.getIncome());
        assertEquals(80, financing.getMonths());
    }

    @Test
    public void constructorShouldThrowIllegalArgumentExceptionWhenInvalidData() {
        // Assert
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            // Arrange
            // Act
            Financing financing = new Financing(100000.0, 2000.0, 20);
        });
        assertEquals("A parcela não pode ser maior que a metade da renda", exception.getMessage());
    }

    @Test
    public void setTotalAmountShouldSetDataWhenValidData() {
        // Arrange
        Financing financing = new Financing(100000.0, 2000.0, 80);

        // Act
        financing.setTotalAmount(90000.0);

        // Assert
        assertEquals(90000.0, financing.getTotalAmount());
    }

    @Test
    public void setTotalAmountShouldThrowIllegalArgumentExceptionWhenInvalidData() {
        // Assert
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            // Arrange
            Financing financing = new Financing(100000.0, 2000.0, 80);

            // Act
            financing.setTotalAmount(110000.0);
        });
        assertEquals("A parcela não pode ser maior que a metade da renda", exception.getMessage());
    }

    @Test
    public void setIncomeShouldSetDataWhenValidData() {
        // Arrange
        Financing financing = new Financing(100000.0, 2000.0, 80);

        // Act
        financing.setIncome(2100.0);

        // Assert
        assertEquals(2100.0, financing.getIncome());
    }

    @Test
    public void setIncomeShouldThrowIllegalArgumentExceptionWhenInvalidData() {
        // Assert
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            // Arrange
            Financing financing = new Financing(100000.0, 2000.0, 80);

            // Act
            financing.setIncome(1900.0);
        });
        assertEquals("A parcela não pode ser maior que a metade da renda", exception.getMessage());
    }

    @Test
    public void setMonthsShouldSetDataWhenValidData() {
        // Arrange
        Financing financing = new Financing(100000.0, 2000.0, 80);

        // Act
        financing.setMonths(81);

        // Assert
        assertEquals(81, financing.getMonths());
    }

    @Test
    public void setMonthsShouldThrowIllegalArgumentExceptionWhenInvalidData() {
        // Assert
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            // Arrange
            Financing financing = new Financing(100000.0, 2000.0, 80);

            // Act
            financing.setMonths(79);
        });
        assertEquals("A parcela não pode ser maior que a metade da renda", exception.getMessage());
    }

    @Test
    public void entryShouldCalculateEntryCorrectly() {
        // Arrange
        // Act
        Financing financing = new Financing(100000.0, 2000.0, 80);

        // Assert
        assertEquals(20000.0, financing.entry());
    }

    @Test
    public void quotaShouldCalculateQuotaCorrectly() {
        // Arrange
        // Act
        Financing financing = new Financing(100000.0, 2000.0, 80);

        // Assert
        assertEquals(1000.0, financing.quota());
    }

}
