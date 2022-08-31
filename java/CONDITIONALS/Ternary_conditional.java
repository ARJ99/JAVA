
package com.mycompany.javacourse.CONDITIONALS;

/**
 *
 * @author alejo
 */
public class Ternary_conditional {
    public static void main(String[] args) {
        int a = 20;
        int b = 22;
        
        //Un numero puede ser convertido a String pero no biceversa. 
        String resultado1 =(a > b)? "A is bigger than B":"B is less than A"; //La variable resultado1 debe ser STRING, si respuesta que contendra es un STRING
        int resultado2 = (a < b)? 20:22;   //La variable resultado2 debe ser INT, si la respuesta contendra un un INT.
        
        System.out.println(resultado1);
        System.out.println(resultado2);
        
    }
}
