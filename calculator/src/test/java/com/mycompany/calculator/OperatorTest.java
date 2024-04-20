package com.mycompany.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class OperatorTest {

    Operator operator;

    @BeforeEach
    void setup() {
        operator = new Operator();
    }

    @DisplayName("Test Operator addition (+) class")
    @Test
    void addOperatorTest() {
        // test add operator from Operator.java class
        assertEquals(5, operator.add(2, 3),
                     "2 + 3 should be 5");
    }
    @DisplayName("Test Operator subtraction (-) class")
    @Test
    void subtractOperatorTest() {
        // test subtract operator from Operator.java class
        assertEquals(-1, operator.subtract(2, 3),
                     "2 - 3 should be -1");
    }

    @DisplayName("Test Operator multiplication (*) class")
    @Test
    void multiplyOperatorTest() {
        // test multiply operator from Operator.java class
        assertEquals(6, operator.multiply(2, 3),
                     "2 * 3 should be 6");
    }

    @DisplayName("Test Operator division (/) class")
    @Test
    void divideOperatorTest() {
        // test divide operator from Operator.java class
        assertEquals(1, operator.divide(3, 3),
                     "3 / 3 should be 1");
    }

    @DisplayName("Test Operator division (/) class")
    @Test
    void divideOperatorTest2() {
        // test divide operator from Operator.java class
        assertEquals(1.5, operator.divide(3, 2),
                     "3 / 2 should be 1.5");
    }
}
