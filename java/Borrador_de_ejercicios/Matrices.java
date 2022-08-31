package Borrador_de_ejercicios;

/*
 *
 * @author alejo
 */
public class Matrices {

    public static void main(String[] args) {

       int[][] matriz1 = new int[5][10]; //Matriz de 5 filas y 10 columnas.
       
       
       // Recorrer matriz por filas y columnas:
       for(int i = 0; i <5; i++){  // El primer iterador es para filas.
           for(int j = 0; j < 10;j++){  // El segundo iterador es para columnas.
               System.out.println(matriz1[i][j]);
           }
       }
       
       //Recorrer matriz columnas y filas:
       
        int[][] matriz2 = new int[5][10]; //Matriz de 5 filas y 10 columnas.
        
        for(int i = 0; i < 10;i++){      // El primer índice recorre las columnas.
            for(int j = 0; j < 5;j++){   // El segundo índice recorre las filas.
                System.out.println(matriz2[j][i]);      // ¡Índices cambiados de orden!
            }
        }
        
    }
}
