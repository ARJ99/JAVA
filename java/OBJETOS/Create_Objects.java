package OBJETOS;



/**
 *
 * @author alejo
 * TO CREATE AN OBJECT
        1-Specify the class name
        2-ObjectName
        3-New keyword 
        4-type the classname();
 */
public class Create_Objects {
    
    int x = 4;  //Properties for default
    int y = 14;
    public static void main(String[] args) {
        Create_Objects Object1 = new Create_Objects();
        System.out.println(Object1.x);
        
        Create_Objects Object2 = new Create_Objects();
        System.out.println(Object2.y);
        
        
    }
}

