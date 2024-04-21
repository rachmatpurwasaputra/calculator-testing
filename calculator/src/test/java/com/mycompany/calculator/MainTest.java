package com.mycompany.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class MainTest {
    @Mock
    Validation validation;

    @Mock
    Calculation calculation;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testPerformCalculation_ValidOperation() throws Exception {
        int operand1 = 5;
        int operand2 = 3;
        String operator = "+";
        int expected = 8;

        when(calculation.calculate(operand1, operand2, operator)).thenReturn(expected);

        int result = calculation.calculate(operand1, operand2, operator);

        verify(validation).validate(operand1, operand2, operator);
        verify(calculation).calculate(operand1, operand2, operator);
        assertEquals(expected, result);
    }

    @Test
    public void testPerformCalculation_InvalidOperation() throws Exception {
        int operand1 = 2;
        int operand2 = 0;
        String operator = "/";

        doThrow(new Exception("Pembagi tidak boleh bernilai nol.")).when(validation).validate(operand1, operand2, operator);

        try {
            validation.validate(operand1, operand2, operator);
        } catch (Exception e) {
            assertEquals("Pembagi tidak boleh bernilai nol.", e.getMessage());
        }

        verify(validation).validate(operand1, operand2, operator);
    }
}
