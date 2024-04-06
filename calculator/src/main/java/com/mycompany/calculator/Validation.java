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
    public boolean validate(int operand1, int operand2, char operator) throws Exception {
        // Validasi nilai operand harus berada dalam rentang yang ditentukan
        if (operand1 < -32768 || operand1 > 32767
            || operand2 < -32768 || operand2 > 32767)
        {
            // System.out.println("Error: Nilai operand melebihi rentang yang diizinkan.");
            
            throw new IllegalArgumentException("Nilai operand melebihi rentang yang diizinkan.");
        }

        // Validasi operator yang diizinkan
        if (operator != '+' && operator != '-' 
             && operator != '*' && operator != '/')
        {
            // System.out.println("Error: Operator tidak valid.");
            
            throw new IllegalArgumentException("Operator tidak valid.");
        }

        // Validasi pembagian dengan nol
        if (operator == '/' && operand2 == 0) {
            // System.out.println("Error: Pembagi tidak boleh bernilai nol.");
            
            throw new Exception("Pembagi tidak boleh bernilai nol.");
        }

        return true; // valid semua, operasi perhitungan bisa dijalankan
    }
}
