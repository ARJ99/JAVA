package com.mycompany.javacourse.CONDITIONALS;

import javax.swing.JOptionPane;

/*
Ejercicio:Ordenar 3 numeros de mayor a menor.
 

 * @author alejo
 */
public class Orden_desendente {

    public static void main(String[] args) {

        int num1, num2, num3;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Type the first number: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Type the first number: "));
        num3 = Integer.parseInt(JOptionPane.showInputDialog("Type the first number: "));

        if ((num1 > num2) && (num2 > num3)) {
            
            JOptionPane.showMessageDialog(null,"Orden: "+num1+"-"+num2+"-"+num3);

        }
        else if((num1>num3)&&(num3>num2)){
            
            JOptionPane.showMessageDialog(null,"Orden:"+num1+"-"+num3+"-"+num2);
        
        }
        else if((num2>num1)&&(num1>num3)){
            
            JOptionPane.showMessageDialog(null,"Orden:"+num2+"-"+num1+"-"+num3);
        
        }
        else if((num2>num3)&&(num3>num1)){
            
            JOptionPane.showMessageDialog(null,"Orden:"+num2+"-"+num3+"-"+num1);
        
        }
        else if((num3>num1)&&(num1>num2)){
            
            JOptionPane.showMessageDialog(null,"Orden:"+num3+"-"+num1+"-"+num2);
        
        }
        else if((num3>num2)&&(num2>num1)){
            
            JOptionPane.showMessageDialog(null,"Orden:"+num3+"-"+num2+"-"+num1);
        
        }
        

    }

}
