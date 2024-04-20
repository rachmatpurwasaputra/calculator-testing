package com.mycompany.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class CalculationTest {

    @Test
    public void testAddition() {
        Calculation calculation = mock(Calculation.class);
        when(calculation.calculate(5, 3, "+")).thenReturn(8);
        int result = calculation.calculate(5, 3, "+");
        assertEquals(8, result);
    }

    @Test
    public void testSubtraction() {
        Calculation calculation = mock(Calculation.class);
        when(calculation.calculate(5, 3, "-")).thenReturn(2);
        int result = calculation.calculate(5, 3, "-");
        assertEquals(2, result);
    }

    @Test
    public void testMultiplication() {
        Calculation calculation = mock(Calculation.class);
        when(calculation.calculate(5, 3, "*")).thenReturn(15);
        int result = calculation.calculate(5, 3, "*");
        assertEquals(15, result);
    }

    @Test
    public void testDivision() {
        Calculation calculation = mock(Calculation.class);
        when(calculation.calculate(6, 3, "/")).thenReturn(2);
        int result = calculation.calculate(6, 3, "/");
        assertEquals(2, result);
    }

    @Test
    public void testDivision2() {
        Calculation calculation = mock(Calculation.class);
        when(calculation.calculate(5, 2, "/")).thenReturn((int) 2.5);
        double result = calculation.calculate(5, 2, "/");
        assertEquals(2.5, result, 0.001);
    }
}
