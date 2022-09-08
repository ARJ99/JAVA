

public class practica1 { //Every code must be in a class
    //Creacion de un Metodo o Funcion
    //Los metodos van primero y luego el void main method para ejecutar el codigo.
    static void FirstMethod(){
        System.out.println("I just got executed");
    }
    static void SecondMethod(String Fname,int Years){
        System.out.println(Fname+" Rios tiene: "+Years);
    }
    static int ThirdMethod(int x){
        return 5+x;
    }
            
    //El metodo static void main es donde se correra el codigo principal.
    public static void main(String[] args) {
        FirstMethod(); //Metodo/Funcion sin argumentos
        SecondMethod("Luis",23); //Metodo con argumentos
        System.out.println(ThirdMethod(4)); //Metodo que retorna un valor
        
    
    }
}
