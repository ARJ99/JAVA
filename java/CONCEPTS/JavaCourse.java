package com.mycompany.javacourse.CONCEPTS;



/**
 *
 * @author alejo 15/08/2022 "Just remember that every Java program has a class
 * name which must match the filename, and that every program must contain the
 * main() method."
 *
 *
 */
public class JavaCourse {

    public static void main(String[] args) {

        //Types of variables
    /* 
           String - stores text, such as "Hello". String values are surrounded by double quotes
           int - stores integers (whole numbers), without decimals, such as 123 or -123
           float - stores floating point numbers, with decimals, such as 19.99 or -19.99
           char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
           boolean - stores values with two states: true or false
         */
        //How to output variables
        int Num = 14;  //Imprimir Variables
        System.out.println(Num);

        String Name = "Alejandro"; //Imprimir String y Numeros
        System.out.println("El nombre es: " + Name + " y tiene: " + Num);

        //Note that if you try to output 2 Int variables the Programm is gonna make a sum.
        int A, B;

        A = 20;
        B = 10;
        System.out.println(A + B);

        //-------------------------------------------------------
        //Java Type Casting
        /*
       Widening Casting (automatically) - converting a smaller type to a larger type size
       byte -> short -> char -> int -> long -> float -> double

        Narrowing Casting (manually) - converting a larger type to a smaller size type
       double -> float -> long -> int -> char -> short -> byte
       
         */
        //Narrow Casting 
        float decimal = (float) 3.4122;

        int newdecimal = (int) decimal;

        System.out.println(newdecimal);

        //------------------------------------------------------
        //Java String How to the length of a string
        String Word = "Amor";
        System.out.println(Word.length());

        //------------------------------------------------------
        //Conditionals
        int num = 20;

        if (num < 10) {
            System.out.println("It's less than 10");
        } else if (num == 20) {
            System.out.println("The outcome is equal");
        } else {
            System.out.println("It's greater than 10.");
        }

        //------------------------------------------------------
        //Short hand if else or Ternaty Operator
        int valor = 20;
        String result = (valor > 18) ? "Es mayor" : "Es menor";
        System.out.println(result);

        //------------------------------------------------------
        //Switch Statements
        int day = 4;

        switch (day) {
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("Wednesday");
            case 4:
                System.out.println("Friday");

        }
        //------------------------------------------------------
        //While loop
        //When you dont know how many times the loop is gonna be needed

        int í = 0;
        while (í < 5) {
            System.out.println(í);
            í++;
        }
        //------------------------------------------------------
        //Do/while

        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 5);

        //------------------------------------------------------
        //For loop
        for (int a = 6; a > 0; a--) {
            System.out.println(a);
        }

        //For-Each Loop
        String[] Cars = {"Mazda", "Mercedez", "Ford"};
        for (String b : Cars) {
            System.out.println(b);
        }

        //------------------------------------------------------
        //Arrays Accessing to an index
        String[] frutas = {"manzana", "banano"};
        System.out.println(frutas[1]);

        //Change an array element
        frutas[0] = "kiwi";
        System.out.println(frutas[0]);

        //------------------------------------------------------
        //Loop through an Array
        String[] motos = {"honda", "yamaha", "ktm"};
        for (int I = 0; I < motos.length; I++) {
            System.out.println(motos[I]);
        }

        //-----------------------------------------------------
        //Multidimensional Arrays
        /*To access the elements of the myNumbers array, 
                  specify two indexes: one for the array, and one for the element 
                  inside that array. */
        int[][] Numeros = {{1, 2}, {3, 4}};
        int x = Numeros[0][1];
        System.out.println(x);
        //------------------------------------------------------
        // Create a Method  -UN METODO ES UNA FUNCION EN PYTHON
        //They are also known as functions.

        /*public class Main {
                                static void myMethod() {
                                // code to be executed
                                }
                      }
         */
 /*
        myMethod() is the name of the method
        static : means that the method belongs to the Main class
        and not an object of the Main class.  
        void: means that this method does not have a return value.
        
        /------------------------------------------------------
        METHOD OVERLOADING 
        Instead of defining two methods that should do the same thing,
        it is better to overload one.

        The example below, we overloaded the plusMethod method to work for both
        int and double
        
        static int plusMethod(int x, int y){
            return x+y;
        }
        
        static double plusMethod(double x, double y){
            return x+y;
        }
        
        public static void main(String[]args){
        int myNum1 = plusMethod(8,5);
        double myNumb2 = plusMethod(4.3,6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
        
        }
        /----------------------------------------------------------
        JAVA OOP
        Create an Object
        An object is created from a Class. Once we have a class created
        we can use it to generate objects. Remerber that Objects are typed inside the public static void main method.
        
        TO CREATE AN OBJECT
        1-Specify the class name
        2-ObjectName
        3-New keyword 
        4-type the classname();
        
        public class Main {
          int x = 5;

        public static void main(String[] args) {
   
        Main myObj = new Main();
        System.out.println(myObj.x);
       
            }
        }
        /-----------------------------------------------------
        Java Class Attributes
        Los atributos se pueden consideran variables con un valor por
        defaut que tendran los objetos.
        
        Another term for class attributes is fields.
        public class Main {
           int x = 5;
           int y = 3;
        }
        Modify Attributes
        public class Main {
        int x;

        public static void main(String[] args) {
        Main myObj = new Main();
        myObj.x = 40;  <----Asi se modifica an Attribute/Field
        System.out.println(myObj.x);
        /---------------------------------------------------------
        //Static versus Non-Static Methods
        
        we created a static method, which means that it can be accessed 
        without creating an object of the class, unlike public,
        which can only be accessed by objects.
        
        Example:
        public class Main {
        // Static method
            static void myStaticMethod() {
                System.out.println("Static methods can be called without creating objects");
            }

         // Public method
            public void myPublicMethod() {
               System.out.println("Public methods must be called by creating objects");
            }

         // Main method
           public static void main(String[] args) {
               myStaticMethod(); // Call the static method
               // myPublicMethod(); This would compile an error//

              Main myObj = new Main(); // Create an object of Main
              myObj.myPublicMethod(); // Call the public method on the object
            }
        }
       
         */
 
 
 /* 





 */
    }
}
