import jeliot.io.*;
import java.util.Scanner;

public class MyClass {

    public static void main() {
    
        Scanner input = new Scanner(System.in);
        double sum = 0;
        int size = input.nextInt();
        double Stu [] = new double [size];
        
        for(int i = 0 ; i < size;i++)
             sum += Stu[i]=input.nextDouble(); 
             double avr = sum/ size ;
             System.out.println("avr "+ avr);
             
         for(int i=0 ;i< size;i++)
              if(Stu[i]>avr )
                System.out.print(Stu[i]+" .");

    }
}
