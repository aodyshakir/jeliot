import jeliot.io.*;
import java.util.Scanner;
class employee{
   double salary ;
  employee(double sal){
    this.salary = sal;
  }
   public double calcSalary(int hours , double otph){
      double newsal = salary;
      if (hours > 40){
         int addHoours = hours - 40 ;
         double addsal = addHoours * otph ;
         newsal += addsal;
       }
        return newsal;
   } 
}

public class MyClass {
    public static void main() {
      Scanner reader = new Scanner(System.in); 
      System.out.println("inter Salary");
      employee e = new employee(reader.nextDouble());
      System.out.println("inter Hours &inter otip");
      double salary = e.calcSalary(reader.nextInt(),reader.nextDouble());
      System.out.println(salary+"$");
      
           
    }
}
