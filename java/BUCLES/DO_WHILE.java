
package com.mycompany.javacourse.BUCLES;

import java.util.Scanner;

/*
 DO WHILE: Se ejecuta una vez sin comprobar si la condición es cierta y luego si verifica si es cierta para ejecutar 


Ejercicio: imprimir números desde el 1 hasta el número que digite el usuario con un incremento de 2.
 @author alejo
 */
public class DO_WHILE {
    public static void main(String[] args) {
        int i = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a number for the loop : ");
        int entrada = sc.nextInt();
        
        do{
            System.out.println(i); 
            i+=2;
        }
        while(i<=entrada);
        
        
        
    }
    
}
