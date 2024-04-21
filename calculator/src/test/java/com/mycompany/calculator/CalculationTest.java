package com.mycompany.calculator;

import org.mockito.InjectMocks;
import org.mockito.Mock;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class CalculationTest {

    @Mock
    Operator operator;

    @InjectMocks
    Calculation calculation;

    @Test
    public void testAddition() {
        when(operator.add(5, 3)).thenReturn(8);

        int result = calculation.calculate(5, 3, "+");

        assertEquals(8, result);
        verify(operator).add(5, 3);
    }

    @Test
    public void testSubtraction() {
        when(operator.subtract(5, 3)).thenReturn(2);

        int result = calculation.calculate(5, 3, "-");

        assertEquals(2, result);
        verify(operator).subtract(5, 3);
    }

    @Test
    public void testMultiplication() {
        when(operator.multiply(5, 3)).thenReturn(15);

        int result = calculation.calculate(5, 3, "*");

        assertEquals(15, result);
        verify(operator).multiply(5, 3);
    }

    @Test
    public void testDivision() {
        when(operator.divide(6, 3)).thenReturn(2);

        int result = calculation.calculate(6, 3, "/");

        assertEquals(2, result);
        verify(operator).divide(6, 3);
    }

    @Test
    public void testDivision2() {
        when(operator.divide(5, 2)).thenReturn((int) 2.5);
        
        double result = calculation.calculate(5, 2, "/");
        
        assertEquals(2.5, result, 0.001);
        verify(operator).divide(5, 2);
    }
}
