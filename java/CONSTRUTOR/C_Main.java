
package com.mycompany.javacourse.CONSTRUTOR;

/*
  CONSTRUCTORS WITH PARAMETERS
-Remember a Constructor is always made  as a public method.
-A Constuctor is used to initialize the attributes from a class.

 @author alejo
 */
public class C_Main {
    int x; // This is the Attribute or Field
    
    
    // This is a Constructor used to initialize the x Attribute.
    public C_Main(int y){  //This constructor has a parameter used to initialize the x Attribute.
        x = y;
    }
    
   
    public static void main(String[] args) {
        C_Main MyObj1 = new C_Main(4);
        System.out.println(MyObj1.x);
    }
    
}
