package Borrador_de_ejercicios;

import java.util.Scanner;

public class Matriz_ejercicio {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digete el número de filas :");
        int filas = sc.nextInt();
        System.out.println("Digete el número de columnas :");
        int columnas = sc.nextInt();
        

        int i, j;

        int[][] matriz = new int[filas][columnas];

        //Se introduce valores a la matriz
        System.out.println("Digite los valores a la matriz :");

        for (i = 0; i < filas; i++) {
            int suma = 0;
            for (j = 0; j < columnas; j++) {
                System.out.println("[" + i + "]" + "[" + j + "]" + " = ");
                matriz[i][j] = sc.nextInt();
                suma+=matriz[i][j];
            }
            System.out.printf("El resultado es = %d\n", suma);  //El uso de printf y el %d , suma. Indica que en donde esta d, se replazara por el valor guardado en suma.
        }
        
        //Mostrar la matriz en pantalla
        
        System.out.println(" Los valores introducidos son estos: ");
        for(i = 0; i < matriz.length;i++ ){
            for(j = 0; j < matriz[i].length;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
        
        

    }
}
