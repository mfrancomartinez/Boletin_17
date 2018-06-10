/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_17_2;

/**
 *
 * @author Marcos
 */
public class Boletin_17_2 {

    /**
     * @param args the command line arguments
     */
    
        
    public static void main(String[] args) {
        
    int[] notas = {9, 5, 5, 4, 2};
        
        int aprob = 0;
        int susp = 0;
        int mayornota = 0;
        float media = 0;
        
        for (int nota: notas){
            
            if(nota>=5) {
                aprob= aprob+1;
            } else {
                susp =susp+1;
            }
            
            if(nota > mayornota){
                mayornota = nota;
            }
            
            media= media+nota;
            
            
        }
        
        System.out.println("El numero de aprobados es: " + aprob);
        System.out.println("El numero de suspensos es: " + susp);
        System.out.println("La media es: " + (media / notas.length));
        System.out.println("La mejor nota es: " + mayornota);
    }
    }
    

