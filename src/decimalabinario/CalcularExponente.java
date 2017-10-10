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
public class CalcularExponente {
    
    public String calcularDecimal(int decimal){
        decimal = decimal/1000;
        String dec = "";
        for(int i = 0; i < 5; i++){
            decimal = decimal *2;
            int aux = decimal;
            aux = (int) aux;
            dec = dec + String.valueOf(aux);
        }
        return dec;
    }
    
    public int calcularExponente(int numero, double decimal){
        if(numero>0){
            numero = numero;
        }else{
            numero = (numero * (-1));
        }
        if(numero == 0){
            
            decimal = decimal*2;
            int cont = 0;
            for(int i=0; i<23; i++){
                cont++;
                double aux = decimal;
                decimal = decimal*2;
                int fin = (int) aux;                
                if(decimal>1.999){
                    decimal = decimal - (2);
                    i--;                    
                }
                if(fin==1){
                    numero = 127 - cont;
                    return numero;
                }
                
            }
        }    
        ConvertirBinario cb = new ConvertirBinario();
        String cadena = cb.convertitBinario(numero);
        int tamaño = cadena.length();
        numero = (tamaño - 1)+127; 
        return numero;
    }
}
