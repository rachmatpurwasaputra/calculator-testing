package com.mycompany.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculationTest {

    @Test
    public void testAddition() {
        Calculation calculation = new Calculation();
        int result = calculation.calculate(5, 3, "+");
        assertEquals(8, result);
    }

    @Test
    public void testSubtraction() {
        Calculation calculation = new Calculation();
        int result = calculation.calculate(5, 3, "-");
        assertEquals(2, result);
    }

    @Test
    public void testMultiplication() {
        Calculation calculation = new Calculation();
        int result = calculation.calculate(5, 3, "*");
        assertEquals(15, result);
    }

    @Test
    public void testDivision() {
        Calculation calculation = new Calculation();
        int result = calculation.calculate(6, 3, "/");
        assertEquals(2, result);
    }
}
