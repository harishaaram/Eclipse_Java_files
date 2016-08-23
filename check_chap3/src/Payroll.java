//******************************************************************
// Payroll applications
// This application computes the pay for three employees 
// and also outputs the total pay
//******************************************************************
import java.io.*;                      // Package for IOException
import Employee;                       // Employee class

public class Payroll
{     
  public static void main(String[] args) throws IOException
  {
    // Declare employees
    Employee emp1; 
    Employee emp2;
    Employee emp3;
    // Instantiate employees
    emp1 = new Employee("Herman", "Herrmann", "George", 14.95);
    emp2 = new Employee("Clara", "Eames", "Julia", 16.28);
    emp3 = new Employee("Matilda", "Hagen", "Louise", 12.73);
    // Output pay for each employee
    System.out.println("Pay " + emp1.name() + " $" + emp1.pay());
    System.out.println("Pay " + emp2.name() + " $" + emp2.pay());
    System.out.println("Pay " + emp3.name() + " $" + emp3.pay());
    // Output total pay for all employees
    System.out.println("Total pay is $" + Employee.totalPay());
  }
}
