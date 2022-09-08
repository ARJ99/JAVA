
package CONSTRUTOR;

/**
 *
 * @author alejo
 */
public class B_Main {
    int ModelYear;   // These are the Attribute or Field
    String ModelName;
    
    
    // This is a Constructor used to initialize the x Attribute.
    public B_Main(int year, String name){      //This constructor has a parameter used to initialize the x Attribute.
        ModelYear = year;
        ModelName = name;
        
    }
    
    public static void main(String[] args) {
        B_Main myCar = new B_Main(2012,"Mazda");
        System.out.println(myCar.ModelName +" -- "+ myCar.ModelYear);
    }
    
    
}
