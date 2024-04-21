package com.mycompany.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ValidationTest {

    Validation validation;
    Exception exception;

    @BeforeEach
    void setupValidationTest() {
        validation = new Validation();
    }

    @DisplayName("Test Validation for both operand are in range and operator is valid")
    @Test
    void validateInRangeOfBothOperandTest() throws Exception {
        validation.validate(10, 10, "+");
    }

    @DisplayName("Test Validation when operand1 is the only operand that out of minimum range")
    @Test
    void validateOperand1OutOfMinRangeTest() {
        exception = assertThrows(IllegalArgumentException.class, () -> {
            validation.validate(-40000, 10, "*");
        });

        assertEquals("Nilai operand melebihi rentang yang diizinkan.", exception.getMessage());
    }

    @DisplayName("Test Validation when operand1 is the only operand that out of maximum range")
    @Test
    void validateOperand1OutOfMaxRangeTest() {
        exception = assertThrows(IllegalArgumentException.class, () -> {
            validation.validate(40000, 10, "/");
        });

        assertEquals("Nilai operand melebihi rentang yang diizinkan.", exception.getMessage());
    }

    @DisplayName("Test Validation when operand2 is the only operand that out of minimum range")
    @Test
    void validateOperand2OutOfMinRangeTest() {
        exception = assertThrows(IllegalArgumentException.class, () -> {
            validation.validate(10, -40000, "-");
        });

        assertEquals("Nilai operand melebihi rentang yang diizinkan.", exception.getMessage());
    }

    @DisplayName("Test Validation when operand2 is the only operand that out of maximum range")
    @Test
    void validateOperand2OutOfMaxRangeTest() {
        exception = assertThrows(IllegalArgumentException.class, () -> {
            validation.validate(10, 40000, "+");
        });

        assertEquals("Nilai operand melebihi rentang yang diizinkan.", exception.getMessage());
    }

    @DisplayName("Test Validation when both operand1 and operand2 are out of range")
    @Test
    void validateBothOperandOutOfRangeTest() {
        exception = assertThrows(IllegalArgumentException.class, () -> {
            validation.validate(-40000, 40000, "*");
        });

        assertEquals("Nilai operand melebihi rentang yang diizinkan.", exception.getMessage());
    }

    @DisplayName("Test Validation when both operand is in range and operator is not valid accepted operator")
    @Test
    void validateOperatorNotValidTest() {
        exception = assertThrows(IllegalArgumentException.class, () -> {
            validation.validate(10, 10, "X");
        });

        assertEquals("Operator tidak valid.", exception.getMessage());
    }

    @DisplayName("Test Validation when doing division with zero as operand2")
    @Test
    void validateDivisionByZeroTest() {
        exception = assertThrows(ArithmeticException.class, () -> {
            validation.validate(10, 0, "/");
        });

        assertEquals("Pembagi tidak boleh bernilai nol.", exception.getMessage());
    }
}
