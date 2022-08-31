package Borrador_de_ejercicios;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.ArrayList;
import java.util.Collections;


/*ADVISE:
   We can not add alter the size of an array, they have a fixed lenght.
   We need to create a list of array
   
 An ArrayList has several advantages over arrays as there is no restriction over the size of the list. 
We can indefinitely keep adding elements to lists. However, it is not as fast as arrays.

 * @author alejo
 */
public class Temperatura {

    public static void main(String[] args) {

        ArrayList<Integer> Lecturas = new ArrayList<Integer>(); //Se crea un arraylist de nombre Lecturas, que permite agregar valores nuevos.

        Timer timer = new Timer();   //Creamos objeto timer que se encarga de realizar un proceso o tarea segun el tiempo asignado.
        TimerTask task = new TimerTask() {   //Se crea objeto task que contendra en el metod  public void run() para  el codigo o terea a realizar.
            @Override
            public void run() {

                int temperatura;
                temperatura = (int) (Math.random() * 100); // Generar numero  entero aleatorio desde el  0-100.
                System.out.println("La temperature is : " + temperatura + " -- " + new Date()); // El new date nos muestra la fecha con hora exacta. 
                Lecturas.add(temperatura);  //Agregamos con la funcion  add() los numeros de temperatura generados aleatoriamente en el ArrayList -Lecturas.

                System.out.println(Lecturas);  //Voy mostrando el arraylist con los valores generados de la temperatura.
                int max = Collections.max(Lecturas); //  La Libreria Collection.max();  nos sirve para hallar el maximo de un ArrayList.
                System.out.println("Maximum is : " + max);

            }
        };
        timer.schedule(task, 0, 5000); // En lugar de 5000(5 segundos) poner 60,000 segundos para el minuto.

    }

}
