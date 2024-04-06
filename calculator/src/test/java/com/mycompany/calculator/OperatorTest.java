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
}
