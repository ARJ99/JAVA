
package CONDITIONALS;

import javax.swing.JOptionPane;

/**
 *Ejercicio: Determinar si un numero es multiplo de otro.
 
 * Es el resultado de multiplicar un numero una cantidad exacta de veces.
 *Un numero es multiplo de otro si lo contiene un numero exacto de veces.
 * Ejemplo:
   5*3 = 15  // 
  15 es multiplo de 5
 
 *Partes de una division:
 1-Dividendo
 2-Resto/Residuo
 3-Divsor
 4-Cociente
 
 * @author alejo
 
 */
public class Multiplo {
    
    public static void main(String[] args) {
        int numero1;
        int numero2;
        
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Type a number:"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Type a number:"));
        
        if (numero1 % numero2 == 0){
            JOptionPane.showMessageDialog(null,"El numero "+ numero1 + " es multiplo de "+numero2);
           
        }
        else{
            JOptionPane.showMessageDialog(null,"No es multiplo de "+numero2);
        
        }
        
        
    }
    
}
