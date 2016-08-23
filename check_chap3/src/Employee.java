//******************************************************************
// This class provides an employee record object. The provided
// constructor takes the employee name as three strings, and 
// creates a Name field. It also takes the pay rate as a double
// value. It then inputs the hours for the week from System.in.
// Instance methods return the name formatted as a string, and
// the pay for the employee. A class meathod returns the total pay.
// Constructor throws IOException.
//******************************************************************
import java.io.*;                 // Package for IOException
import Name;                      // Class for names
class Employee
{
  Name myName;                    // Employee name field
  double rate;                    // Payrate
  double hours;                   // Hours worked
  double wages;                   // Simple wages (rate * hours)
  static double total = 0.0;      // Total pay for all employees
  
  // Builds an employee record
  public Employee (String first, String last, String middle, 
                   double payrate) throws IOException
  {
    BufferedReader in;            // Input stream for strings
    // Initialize fields
    myName = new Name(first, last, middle);
    rate = payrate; 
    // Instantiate input stream in using System.in
    in = new BufferedReader(new InputStreamReader(System.in));
    // Prompt for hours worked
    System.out.print("Enter hours worked by " + myName.firstLast() + ": ");
    // Get hours worked and convert from string to double
    hours = Double.parseDouble(in.readLine());                             
    wages = (double)((int)(hours * rate * 100.0 + 0.5))/100;
    total = total + wages;
  }

  // Returns employee name
  public String name()
  {
    return myName.lastFirstMI();
  }
  
  // Returns employee wages
  public double pay()
  {
    return wages;
  }
  
  // Returns total wages for all employees
  public static double totalPay()
  {
    return total;
  }
}
