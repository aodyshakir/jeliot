import jeliot.io.*;
import java.util.Scanner;

public class MyClass {
    public static void main() {
      Scanner reader = new Scanner(System.in);
      
      System.out.println("inter wieght");
      double w =reader.nextDouble();
      System.out.println("inter hieght");
      double h =reader.nextDouble();
      double bmi= w/(h*h); 
      
      if (bmi <= 18.5)
         System.out.println("Under Weight");
      else if (bmi < 25 && bmi >=18.5)
          System.out.println("Noemal");
      else if (bmi <30 && bmi >=25 )  
         System.out.println("over weight");
      else if (bmi >= 30)
         System.out.println("obese") ;    
      

    }
}