
package com.mycompany.javacourse.CONDITIONALS;

import java.util.Scanner;
import javax.swing.JOptionPane;

/*
PORQUE NO USAR     ==
Cuando comparamos un String con == lo que se comprueba es si ambos Strings son el mismo objeto, pero no si su contenido es el mismo por lo que este método no nos vale 

COMPARAR CON EQUALS()
Con equals se compara el contenido del string por lo que el resultado será el que queríamos.

Ejercicio:
 Comprobar si 2 strings son iguales o no.

 * @author alejo
 */
public class Password {
    public static void main(String[] args) {
        
        String keyword = "alejo14";
        String password;
        
        password = JOptionPane.showInputDialog("Digite una palabra: "); 
        //Scanner sc= new Scanner(System.in);    //<------------------Esta es otra forma de hace el input.
        //password = sc.nextLine();
        
        if (password.equals(keyword)){
            
            JOptionPane.showMessageDialog(null, "Access Granted");
            
        }
        else {
            JOptionPane.showMessageDialog(null,"Access Denied.");
            
        }
        
        
        
        
        
        
    }
}
