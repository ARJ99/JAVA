package com.mycompany.javacourse.CONDITIONALS;

import javax.swing.JOptionPane;

/**
 
 * @author alejo
 El metodo de input y output va a ser JOptionPane.showInputDialog(object);
 *  Este metodo guarda un string, si deseas  guardas un entero debes usar Integer.parseInt(JOption...)
 */
public class Condicional {

    public static void main(String[] args) {
        int numero, dato = 5;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número:")); 
       
        if (numero == dato){
            JOptionPane.showMessageDialog(null,"Ambos numeros son iguales.");
        }
        else{
            JOptionPane.showMessageDialog(null,"El numero es diferente de 5.");
        
        }
        
        
    }

}
