package com.mycompany.calculator;

/**
 * Validation class for calculator application.
 * This class contains methods for validating input values
 * like operand1, operand2, and operator.
 * 
 * @version 1.0
 * @since 2024-04-06
 * @author Kelompok B1 (Rafi, Rachmat, Raihan)
 */
public class Validation{
    public boolean validate(int operand1, int operand2, String operator) throws Exception {
        // Validasi nilai operand harus berada dalam rentang yang ditentukan
        if (operand1 < -32768 || operand1 > 32767
            || operand2 < -32768 || operand2 > 32767)
        {
            // System.out.println("Error: Nilai operand melebihi rentang yang diizinkan.");
            
            throw new IllegalArgumentException("Nilai operand melebihi rentang yang diizinkan.");
        }

        // Validasi operator yang diizinkan
        if (!operator.equals("+") && !operator.equals("-") 
             && !operator.equals("*") && !operator.equals("/"))
        {            
            throw new IllegalArgumentException("Operator tidak valid.");
        }

        // Validasi pembagian dengan nol
        if (operator.equals("/") && operand2 == 0) {
            throw new ArithmeticException("Pembagi tidak boleh bernilai nol.");
        }

        return true; // valid semua, operasi perhitungan bisa dijalankan
    }
}
