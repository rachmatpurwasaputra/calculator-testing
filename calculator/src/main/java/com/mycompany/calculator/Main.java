package com.mycompany.calculator;

/**
 * Main class for calculator application
 * 
 * @version 1.0
 * @author Kelompok B1 (Rafi, Rachmat, Raihan)
 * @since 2024-04-06
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Input angka pertama ");
        int operand1 = Integer.parseInt(System.console().readLine());

        System.out.println("Input angka kedua ");
        int operand2 = Integer.parseInt(System.console().readLine());

        System.out.println("Input operator ");
        String operatorChar = System.console().readLine();

        int result;
        try {
            Validation validation = new Validation();
            validation.validate(operand1, operand2, operatorChar);
            
            Calculation calculation = new Calculation(new Operator());
            result = calculation.calculate(operand1, operand2, operatorChar);

            System.out.println("Hasil perhitungan >>> " + result);
        } catch (Exception validationErr) {
            System.out.println("Error: " + validationErr.getMessage());
            return;
        } finally {
            System.out.println("Program selesai.");
        }
    }
}