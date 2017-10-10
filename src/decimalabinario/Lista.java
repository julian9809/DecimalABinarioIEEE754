/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decimalabinario;

/**
 *
 * @author Estudiantes
 */
public class Lista {
    Nodos cab;
    
    //Lista(){
    //    cab = null;
    //}
    
    public void insertar(int x){
        if(cab == null){
            cab = new Nodos(x);
            return;
        }
        Nodos p; 
        Nodos q = null;
        p = cab;
        while(p != null){
            q = p;
            p = p.sig;
        }
        Nodos n;
        n = new Nodos(x);
        q.sig = n;
        System.out.println("funcionaIns");
    }
    
    //mostrar signo
    public String mostrarS(){
        Nodos p;
        p = cab;
        System.out.println("funciona");
        return String.valueOf(p.dato);
    }
   
    //mostrar exponente
    public String mostrarE(){
        Nodos p = cab.sig;
        int i = 0;
        String exponente = "";
        for(i = 0; i < 8; i++){
            exponente = exponente + String.valueOf(p.dato);
            p = p.sig;
        }
        System.out.println("funciona");
        return exponente;
    }
    
    //mostrar mantiza
    public String mostrarM(){
        Nodos p = cab;
        String mantiza = "";
        for(int i = 0; i < 31; i++){
            p = p.sig;
            if(i>7){
                mantiza = mantiza + String.valueOf(p.dato);
            }    
        }
        System.out.println("funcionaMa");
        return mantiza;
    }
}
