package com.mycompany.javacourse.OOP;

/*
 Java Encapsulation
 
The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. To achieve this, you must:

declare class variables/attributes as private
provide public get and set methods to access and update the value of a private variable

-Get and Set:
You learned from the previous chapter that private variables can only be accessed within the same class (an outside class has no access to it). 
However, it is possible to access them if we provide public get and set methods.

The get method returns the variable value, and the set method sets the value.
Syntax for both is that they start with either get or set, followed by the name of the variable, with the first letter in upper case:

Get Syntax:
Public Datatype getVariable_Name(){
     //code to be execuated.
}

Set Syntax:
Public Datatype setVariable_Name(){
     //code to be execuated.
}
---------------------------------------------------------------------------------------------------------------------------
Example:
public class EJEMPLO {

    private String name;        // This  attribute is  private = restricted access

    

    // Setter
    public void setName(String newName) {   // this method allow you to modify the attribute
        this.name = newName;
    }
    // Getter
    public String getName() {         // This method allow you to return the value of a attribute.
        return name;
    }

    public static void main(String[] args) {
        EJEMPLO myObj = new EJEMPLO();
        myObj.setName("John");
        System.out.println(myObj.getName());

    }

}


Why Encapsulation?
Better control of class attributes and methods
Class attributes can be made read-only (if you only use the get method), or write-only (if you only use the set method)
Flexible: the programmer can change one part of the code without affecting other parts
Increased security of data



@author alejo
 */
public class Encapsulation {
    
    //Private Attributes.
    private String marca; //Solo puedes modificar una Priv. A. con un set.
    private int year = 2023; // Solo puede mostrar Priv. A. el valor con un get.
    
    
    //Se puede decir que el metodo set es un contructor para inicializar los atributos privados.
    public void setMarca(String Empresa){
        this.marca = Empresa;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public int getYear(){
        return year;
    }
    
    
    public static void main(String[] args) {
        
        Encapsulation Carro = new Encapsulation();
        Carro.setMarca("Mazda");
        
        System.out.println(Carro.getMarca());
        System.out.println(Carro.getYear());
        
        
    }

}
