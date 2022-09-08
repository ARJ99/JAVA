
package CONDITIONALS;

import java.io.IOException;

/*
Ejercicio: Comprueba si una letra es mayuscula o no.
 * @author alejo
 */
public class Check_Mayuscula {
    public static void main(String[] args) throws IOException {
        char car;
        car =(char)System.in.read();
        
        if (Character.isUpperCase(car)) //utilizamos el método isUpperCase de la clase Character        
        {
            System.out.println("Es una letra mayúscula");
        } else {
            System.out.println("No es una letra mayúscula");
        }
                
                
                
                
                
    }
    
}
