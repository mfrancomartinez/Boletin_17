/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_17_3;

import javax.swing.JOptionPane;

/**
 *
 * @author Marcos
 */
public class Boletin_17_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int[] notas = {9, 5, 8, 2, 0 };
    String[] alumnos = { "Marcos", "Gonzalo", "Celso", "Joshua", "Damian" };
        
    System.out.println("Los alumnos aprobados son: ");
        
    for (int e = 0; e < alumnos.length; e++){
            
        if(notas[e]>=5) {
            System.out.println(alumnos[e]);
        }
            
        }
        System.out.println("Notas ordenadas: ");
        descendiente(notas, alumnos);
        
        for (int e = 0; e < alumnos.length; e++){
            
            System.out.println(alumnos[e] + ": " + notas[e]);
        }
        
        
        String visualizacion = JOptionPane.showInputDialog("Inserta el nombre del alumno: ");
        
        for (int e = 0; e < alumnos.length; e++){
            
            if (alumnos[e]==visualizacion){
                System.out.println("Para el alumno: " + alumnos[e] + ", la nota es: " + notas[e]); break;
            }
        }
    }
    
    static void descendiente(int[] orden, String[] alumnos) {
        
        for (int i = 0 ; i < orden.length - 1 ; i++) {
            int max = i;
 
            for (int j = i + 1 ; j < orden.length ; j++) {
                if (orden[j] > orden[max]) {
                    max = j;
                    
                }
            }
 
            if (i != max) {
                
                int aux = orden[i];
                orden[i] = orden[max];
                orden[max] = aux;
                
                String aux2 = alumnos[i];
                alumnos[i] = alumnos[max];
                alumnos[max] = aux2;
            }
        }
    }
    }
    

