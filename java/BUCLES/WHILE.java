package BUCLES;

import java.util.Scanner;

/*
BUCLE WHILE

while(condicion) {  }
Ejercicio: Imprimir numero desde el 0 hasta el 10.
 
 @author alejo
 */
public class WHILE {

    public static void main(String[] args) {

        //int i =0;
        /*while(i <=10){
                    System.out.println(i);
                      i++;
                      }*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a number for the loop : ");

        int entrada = sc.nextInt();
        int i = 1;

        while (i <= entrada) {
            System.out.println(i);
            i++;
        }

    }

}
