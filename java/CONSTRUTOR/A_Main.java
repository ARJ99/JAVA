package com.mycompany.javacourse.CONSTRUTOR;
/* Java Constructors

A constructor in Java is a special method that is used to initialize objects.
The constructor is called when an object of a class is created.
It can be used to set initial values for object attributes

Remenber!
An static method doesn't need an object to be accessed.
A non - static /public method needs to create an object to be accessed.

*/

public class A_Main {

    int x; //Attribute or Field

    public A_Main() {  //Constructor
        x = 14;
    }

    public static void main(String[] args) {
        A_Main myObj = new A_Main(); // Creation of object
        System.out.println(myObj.x);
    }

}
