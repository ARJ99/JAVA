package com.mycompany.javacourse.CONDITIONALS;

import javax.swing.JOptionPane;
import java.util.Scanner;

/*
 METODOS JOptionPane y SCANNER Usados para el output.
Ejercicio: Determinar si un número es par o impar(even or odd):
 * @author alejo
 */
public class Par_Impar {

    public static void main(String[] args) {
        int num1;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Type the number: "));

        if (num1 % 2 == 0) {

            JOptionPane.showMessageDialog(null, "The number : " + num1 + " is an even number.");

        } else {
            JOptionPane.showMessageDialog(null, "The number : " + num1 + " is an odd number.");

        }

        //-----------------------------------------------------------------------------------------------------
        //This is the same exercise but is a different method to print.
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Type the number: ");
        num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }

    }
}
