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
public class Numeros {
   int numval;

    public void darValor(int[] num) {
        for (int e = 0; e < num.length; e++) {
            numval = (int) (Math.random() * 50) + 1;
            num[e] = numval;
        }
    }

    public void mostrarArray(int[] num) {
        for (int e = 0; e < num.length; e++) {
            System.out.println("Numero: " + num[e]);
        }
    }

    public void mostrarArrayReves(int[] num) {

        for (int e = num.length - 1; e >= 0; e--) {
            System.out.println("Numero: " + num[e]);
        }
    }

    public void ordenar(int[] num) {
        int i, j;
        int aux;
        for (i = 0; i < num.length - 1; i++) {
            for (j = i + 1; j < num.length; j++) {
                if (num[i] > num[j]) {
                    aux = num[i];
                    num[i] = num[j];
                    num[j] = aux;
                }
            }
        }
    } 
}
