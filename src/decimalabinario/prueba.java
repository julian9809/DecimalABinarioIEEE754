/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decimalabinario;

/**
 *
 * @author Julian
 */
public class prueba {
    
    public static void main(String args[]){
        double decimal = 0.004*2;
        for(int i=0; i<23; i++){
                double aux = decimal;
                decimal = decimal*2;
                int fin = (int) aux;                
                if(decimal>1.999){
                    decimal = decimal - (2);
                    i--;                    
                }
                if(fin<2){
                    System.out.print(fin);
                }
            }
    }
    
}
