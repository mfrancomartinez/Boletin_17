/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_17_1;

/**
 *
 * @author Marcos
 */
public class Boletin_17_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Numeros num = new Numeros();
        int numeros[] = new int[6];
        num.darValor(numeros);
        num.mostrarArray(numeros);//Mostrar numeros
        num.ordenar(numeros);        
        num.mostrarArray(numeros);//Mostrar numeros ordenados        
        num.mostrarArrayReves(numeros);//Mostrar numeros al revés
    }
    
}
