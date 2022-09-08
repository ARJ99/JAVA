package BUCLES;

import java.util.Scanner;

/**
 * Ejercicio: Leer por teclado un número entero N no negativo y mostrar el
 * factorial de todos los números desde 0 hasta N
 *
 * @author alejo
 */
public class Factorial {

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Type a number postive :");
        int a = SC.nextInt();
        int i = 1;

        do {
            if (a > 0) {
                int factorial = 1;
                for (i = 1; i <= a; i++) {
                    factorial = factorial * i;
                    System.out.println("El factorial de " + i + " es :" + factorial);

                }
            } else {
                System.out.println("A negative value is not allow.");
            }

        } while (i <= a);

    }
}
