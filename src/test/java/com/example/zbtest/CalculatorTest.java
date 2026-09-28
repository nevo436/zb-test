package com.example.zbtest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void addsNumbers() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void subtractsNumbers() {
        assertEquals(2, calculator.subtract(5, 3));
    }

    @Test
    void rejectsDivisionByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(4, 0));
    }
}
