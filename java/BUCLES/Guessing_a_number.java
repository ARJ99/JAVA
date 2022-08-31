package com.mycompany.javacourse.BUCLES;

import java.util.Scanner;

/*
Ejercicío: Realizar un juego para adivinar un número. Para ello generar un num aleatorio entre 0-100,
Luego ir pidiendo números, indicando si  "es mayor" o " es menor". El proceso terminar cuando se 
adivina el número.

  @author alejo
 */
public class Guessing_a_number {

    public static void main(String[] args) {
        int num;
        int aleatorio;
        aleatorio = (int) (Math.random() * 6);

        do {

            System.out.println("Type a number:");
            Scanner sc = new Scanner(System.in);
            num = sc.nextInt();
            
            if (num > aleatorio){
                System.out.println("The number is less than "+num);
            }else{
                System.out.println("The number is greater than "+num);
            }
            

        } while (num != aleatorio);

    }

}
