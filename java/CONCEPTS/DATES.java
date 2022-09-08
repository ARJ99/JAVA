
package CONCEPTS;

/*
Java Dates

Java does not have a built-in Date class, but we can import the java.time package to work with the date and time API. The package includes many date and time classes. For example:

Class	                              Description
LocalDate	                     Represents a date (year, month, day (yyyy-MM-dd))
LocalTime	                     Represents a time (hour, minute, second and nanoseconds (HH-mm-ss-ns))
LocalDateTime	Represents both a date and a time (yyyy-MM-dd-HH-mm-ss-ns)
DateTimeFormatter	Formatter for displaying and parsing date-time objects

Display Current Date:

To display the current date, import the java.time.LocalDate class, and use its now() method:

Example:
import java.time.LocalDate; // import the LocalDate class

public class Main {
  public static void main(String[] args) {
    LocalDate myObj = LocalDate.now(); // Create a date object
    System.out.println(myObj); // Display the current date
  }
}
---------------------------------------------------------------------------------------------------------------------------------------
Display Current Date and Time

To display the current date and time, import the java.time.LocalDateTime class, and use its now() method:

Example:
import java.time.LocalDateTime; // import the LocalDateTime class

public class Main {
  public static void main(String[] args) {
    LocalDateTime myObj = LocalDateTime.now();
    System.out.println(myObj);
  }
}

---------------------------------------------------------------------------------------------------------------------------------------

Formatting Date and Time

Example:

import java.time.LocalDateTime; // Import the LocalDateTime class
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class

public class Main {
  public static void main(String[] args) {
    LocalDateTime myDateObj = LocalDateTime.now();
    System.out.println("Before formatting: " + myDateObj);
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    String formattedDate = myDateObj.format(myFormatObj);
    System.out.println("After formatting: " + formattedDate);
  }
}

The ofPattern() method accepts all sorts of values, if you want to display the date and time in a different format. For example:

Value	Example	Tryit
yyyy-MM-dd	"1988-09-29"
.ofPattern("dd-MM-yyyy HH:mm:ss");  

dd/MM/yyyy	"29/09/1988"
.ofPattern("dd/MM/yyyy HH:mm:ss");  

dd-MMM-yyyy	"29-Sep-1988"
.ofPattern("dd/MM/yyyy HH:mm:ss"); 

E, MMM dd yyyy	"Thu, Sep 29 1988"
.ofPattern("E, MMM dd yyyy HH:mm:ss");




 */

