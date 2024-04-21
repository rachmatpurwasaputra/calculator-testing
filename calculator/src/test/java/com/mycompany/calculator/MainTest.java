package com.mycompany.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MainTest {
    private Main calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Main();
    }

    @Test
    @DisplayName("Test addition")
    public void testAddition() {
        int result = calculator.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    @DisplayName("Test subtraction")
    public void testSubtraction() {
        int result = calculator.subtract(5, 3);
        assertEquals(2, result);
    }

    @Test
    @DisplayName("Test multiplication")
    public void testMultiplication() {
        int result = calculator.multiply(2, 3);
        assertEquals(6, result);
    }

    @Test
    @DisplayName("Test division")
    public void testDivision() {
        double result = calculator.divide(10, 2);
        assertEquals(5.0, result);
    }
   
}
