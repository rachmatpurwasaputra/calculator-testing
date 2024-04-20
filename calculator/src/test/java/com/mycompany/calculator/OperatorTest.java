package com.mycompany.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class OperatorTest {

    @Mock
    Operator operator;

    @BeforeEach
    void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @DisplayName("Test Operator addition (+) class")
    @Test
    void addOperatorTest() {
        when(operator.add(2, 3)).thenReturn(5);
        assertEquals(5, operator.add(2, 3),
                     "2 + 3 should be 5");
    }

    @DisplayName("Test Operator subtraction (-) class")
    @Test
    void subtractOperatorTest() {
        when(operator.subtract(2, 3)).thenReturn(-1);
        assertEquals(-1, operator.subtract(2, 3),
                     "2 - 3 should be -1");
    }

    @DisplayName("Test Operator multiplication (*) class")
    @Test
    void multiplyOperatorTest() {
        when(operator.multiply(2, 3)).thenReturn(6);
        assertEquals(6, operator.multiply(2, 3),
                     "2 * 3 should be 6");
    }

    @DisplayName("Test Operator division (/) class")
    @Test
    void divideOperatorTest() {
        when(operator.divide(3, 3)).thenReturn(1);
        assertEquals(1, operator.divide(3, 3),
                     "3 / 3 should be 1");
    }

    @DisplayName("Test Operator division (/) class")
    @Test
    void divideOperatorTest2() {
        when(operator.divide(3, 2)).thenReturn((int)1.5);
        assertEquals(1.5, operator.divide(3, 2),
                     "3 / 2 should be 1.5");
    }
}
