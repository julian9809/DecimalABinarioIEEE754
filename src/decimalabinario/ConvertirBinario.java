/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decimalabinario;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class ConvertirBinario {
    
    public String convertitBinario(int n){
        String b = ""; // binary representation as a string
        while (n != 0) {
            int r = (int)(n % 2); // remainder
            b = r + b; // concatenate remainder
            n /= 2; // reduce n
        }
        return String.valueOf(Long.parseLong(b));
    }
}
    

