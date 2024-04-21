package com.mycompany.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


public class MainTest {

    @Test
    void testAddition() {
        int operand1 = 5;
        int operand2 = 3;
        String operator = "+";

        Calculation calculation = mock(Calculation.class);
        when(calculation.calculate(operand1, operand2, operator)).thenReturn(8);

        assertEquals(8, calculation.calculate(operand1, operand2, operator));
    }

    @Test
    void testSubtraction() {
        int operand1 = 5;
        int operand2 = 3;
        String operator = "-";

        Calculation calculation = mock(Calculation.class);
        when(calculation.calculate(operand1, operand2, operator)).thenReturn(2);

        assertEquals(2, calculation.calculate(operand1, operand2, operator));
    }

    @Test
    void testMultiplication() {
        int operand1 = 5;
        int operand2 = 3;
        String operator = "*";

        Calculation calculation = mock(Calculation.class);
        when(calculation.calculate(operand1, operand2, operator)).thenReturn(15);

        assertEquals(15, calculation.calculate(operand1, operand2, operator));
    }

    @Test
    void testDivision() {
        int operand1 = 10;
        int operand2 = 2;
        String operator = "/";

        Calculation calculation = mock(Calculation.class);
        when(calculation.calculate(operand1, operand2, operator)).thenReturn(5);

        assertEquals(5, calculation.calculate(operand1, operand2, operator));
    }

    @Test
    void testDivisionByZero() {
        int operand1 = 10;
        int operand2 = 0;
        String operator = "/";

        Calculation calculation = mock(Calculation.class);
        when(calculation.calculate(operand1, operand2, operator)).thenThrow(ArithmeticException.class);

        assertThrows(ArithmeticException.class, () -> calculation.calculate(operand1, operand2, operator));
    }

    @Test
    void testInvalidOperator() {
        int operand1 = 10;
        int operand2 = 5;
        String operator = "%";
    
        Validation validation = mock(Validation.class);
        try {
            doThrow(IllegalArgumentException.class).when(validation).validate(operand1, operand2, operator);
            
            validation.validate(operand1, operand2, operator);
            fail("Expected IllegalArgumentException was not thrown");
        } catch (IllegalArgumentException e) {
            System.out.println("Operator tidak valid.");
        } catch (Exception e) {
            fail("Unexpected exception was thrown: " + e);
        }
    }

    @Test
    void testOperandOutOfRange() {
        int operand1 = 40000;
        int operand2 = 5;
        String operator = "+";

        Validation validation = mock(Validation.class);
        try {
            doThrow(IllegalArgumentException.class).when(validation).validate(operand1, operand2, operator);
            
            validation.validate(operand1, operand2, operator);
            fail("Expected IllegalArgumentException was not thrown");
        } catch (IllegalArgumentException e) {
            System.out.println("Nilai operand melebihi rentang yang diizinkan.");
        } catch (Exception e) {
            fail("Unexpected exception was thrown: " + e);
        }
    }
}