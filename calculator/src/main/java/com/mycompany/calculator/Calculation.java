package com.mycompany.calculator;

/**
 * Calculation class for calculator application.
 * This class contains methods for calculating the result of
 * arithmetic operations like addition, subtraction, multiplication,
 * and division.
 *  
 * Param 1: operand1 (int) - first operand
 * Param 2: operand2 (int) - second operand
 * Param 3: operator (char) - arithmetic operator
 * 
 * @version 1.0
 * @since 2024-04-06
 * @author Kelompok B1 (Rafi, Rachmat, Raihan)
 */
public class Calculation {
    private final Operator operator;

    public Calculation(Operator operator) {
        this.operator = operator;
    }

    public int calculate(int operand1, int operand2, String operator) {
        int result = 0; // inisialisasi result

        switch (operator) {
            case "+":
                result = this.operator.add(operand1, operand2);
                break;
            case "-":
                result =  this.operator.subtract(operand1, operand2);
                break;
            case "*":
                result =  this.operator.multiply(operand1, operand2);;
                break;
            case "/":
                result =  this.operator.divide(operand1, operand2);
                break;
        }

        return result;
    }
}
