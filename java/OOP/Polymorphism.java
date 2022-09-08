package OOP;

/*
 JAVA POLYMORPHISM

Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.

Like we specified in the previous chapter; Inheritance lets us inherit attributes and methods from another class. 
Polymorphism uses those methods to perform different tasks. This allows us to perform a single action in different ways.

For example, think of a superclass called Animal that has a method called animalSound(). 
Subclasses of Animals could be Pigs, Cats, Dogs, Birds - And they also have their own implementation of an animal sound (the pig oinks, and the cat meows, etc.):

 //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
TIPOS DE POLIMORFISMO:

Sobrecarga: El más conocido y se aplica cuando existen funciones ó Metodos con el mismo nombre en clases que son completamente independientes una de la otra y se sobreescriben.
Paramétrico: Existen funciones con el mismo nombre pero se usan diferentes parámetros (nombre o tipo). Se selecciona el método dependiendo del tipo de datos que se envíe.
Inclusión: Es cuando se puede llamar a un método sin tener que conocer su tipo, así no se toma en cuenta los detalles de las clases especializadas, utilizando una interfaz común.

EJEMPLO2: EXPLICANDO EL POLIMORFISMOR DE TIPO SOBRECARGAR(overloading) Y PARAMETRICO(Parametric polymorphism):
Aquí el método demo() se sobrecarga 3 veces: el primer método tiene 1 parámetro int, el segundo método tiene 2 parámetros int y el tercero tiene un parámetro doble. 
Por lo que para lidiar con esta variedad el método que se llamará está determinado por los argumentos que pasamos al llamar a los métodos. 
Esto sucede en tiempo de compilación en tiempo de ejecución, por lo que este tipo de polimorfismo se conoce también como polimorfismo en tiempo de compilación.

 */
public class Polymorphism {
    //--------------------------------------------------------------------------------------------------------------
    //Ejercicio 2:
    //Overload Polymorphism
    void demo (int a)             // Se crea el metodo demo con la tarea de imprimir algo especificamente.
    {
       System.out.println ("a: " + a);
    }
    void demo (int a, int b)      // Aqui se sobrecargar el metodo demo como una tarea diferente pero ambos metodos tienen el mismo nombre.
    {
       System.out.println ("a and b: " + a + "," + b);
    }
    double demo(double a) {        // Aqui se sobrecargar el metodo demo nuevamente.
       System.out.println("double a: " + a);
       return a*a;
    }
    //--------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        
        //-------------------------------------------------------------------------
        //Parametric Polymorphism
        //En el tiempo de compilacion segun el tipo de  paramentro(int,double,etc) que enviemos al metodo demo, Se ejecutara cualquiera de los metedos demo segun su tipo de dato o cantidad de paramentros.
        Polymorphism Obj = new Polymorphism();
        double result;
        Obj .demo(10);
        Obj .demo(10, 20);// Se enviaron dos numeros enteros al metodo demo,Aunque todos tienen el mismo nombre demo. Se ejecutara el metodo con dos parametros enteros en lugar de los otros.
        result = Obj .demo(5.5);
        System.out.println("Answer : " + result);
        
    }

}
