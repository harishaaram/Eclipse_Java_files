//******************************************************************
// This class provides a basic name object. The default constructor 
// requests that a name be entered from System.in. A second constructor
// allows creation of a name from strings. Methods return the name
// in various formats.
//******************************************************************
import java.io.*;                      // Package for stream readers
class Name
  {
    String first;                      // Person's first name
    String last;                       // Person's last name
    String middle;                     // Person's middle name
    
    // Gets a name from System.in
    public Name() throws IOException   
    {
      BufferedReader in;                           // Input stream for strings
      //Instantiate in using System.in
      in = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Enter first name: ");      // Prompt for first name
      first = in.readLine();                       // Get first name
      System.out.print("Enter last name: ");       // Prompt for last name
      last = in.readLine();                        // Get last name
      System.out.print("Enter middle name: ");     // Prompt for middle name
      middle = in.readLine();                      // Get middle name
    }
    
    // Builds a name from string parameters
    public Name(String firstName, String lastName, String middleName)
    {
      first = firstName;                           // Assign parameters to fields
      last = lastName;
      middle = middleName;
    }
    
    // Returns name in first last format
    public String firstLast()       
    {
      return first + " " + last;
    }
    
    // Returns full name in usual format
    public String full()                   
    {
      return first + " " + middle + " " + last;
    }
    
    // Returns name as last, first, m.
    public String lastFirstMI()   
    {
      return last + ", " + first + ", " + middle.substring(0, 1) + ".";
    }
  }
