import jeliot.io.*;
import java.util.Scanner;

public class MyClass {
    public static void main() {
    
     double [] myList = new double[5];
     Scanner input = new Scanner(System.in);
     System.out.println("Enrer "+myList.length+" Value");
     
     for(int i = 0; i < myList.length; i++)
         myList[i] = input.nextDouble();
         
   //  for(int i= myList.length-1 ; i>=0; i--)
          
         // System.out.println(myList[i]);
          
      // Or
      
      for(int i = 0 ; i< myList.length ; i++)
            System.out.println(myList[myList.length -i-1]);   
       
       
    }
}