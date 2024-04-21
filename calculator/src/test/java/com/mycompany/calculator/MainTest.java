package com.mycompany.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    void testAddition() {
        int operand1 = 5;
        int operand2 = 3;
        String operator = "+";

        assertEquals(8, new Calculation(new Operator()).calculate(operand1, operand2, operator));
    }

    @Test
    void testSubtraction() {
        int operand1 = 5;
        int operand2 = 3;
        String operator = "-";

        assertEquals(2, new Calculation(new Operator()).calculate(operand1, operand2, operator));
    }

    @Test
    void testMultiplication() {
        int operand1 = 5;
        int operand2 = 3;
        String operator = "*";

        assertEquals(15, new Calculation(new Operator()).calculate(operand1, operand2, operator));
    }

    @Test
    void testDivision() {
        int operand1 = 10;
        int operand2 = 2;
        String operator = "/";

        assertEquals(5, new Calculation(new Operator()).calculate(operand1, operand2, operator));
    }

    @Test
    void testDivisionByZero() {
        int operand1 = 10;
        int operand2 = 0;
        String operator = "/";

        assertThrows(ArithmeticException.class, () -> new Calculation(new Operator()).calculate(operand1, operand2, operator));
    }

    @Test
    void testInvalidOperator() {
        int operand1 = 10;
        int operand2 = 5;
        String operator = "%";
    
        assertThrows(IllegalArgumentException.class, () -> new Validation().validate(operand1, operand2, operator));
    }
    

    @Test
    void testOperandOutOfRange() {
        int operand1 = 40000;
        int operand2 = 5;
        String operator = "+";

        assertThrows(IllegalArgumentException.class, () -> new Validation().validate(operand1, operand2, operator));
    }
}
