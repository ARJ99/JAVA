package com.mycompany.javacourse.OOP;

/*

Ejercicio1:  de polimorfismo con sobrecargar 
 
  @author alejo
 */
class Animal {

    public void animalSound() {
        System.out.println("GRRR");
    }
}

class Pig extends Animal {

    public void animalSound() {
        System.out.println("The pig says: wee wee");  //Aqui se sobre sobrecarga el metodo animal por primera vez.
    }
}

class Dog extends Animal {

    public void animalSound() {
        System.out.println("The dog says: Woof Woof"); //Aqui tambien se sobrecarga el metodo animal.
    }
}

class Animal_polym {

    public static void main(String[] args) {
       //Syntaxy para sobrecarga:
       //Superclase ObjectName = new Subclass();
        Animal myPig = new Pig();
        Animal myDog = new Dog();

       
        myPig.animalSound();
        myDog.animalSound();
    }
}
