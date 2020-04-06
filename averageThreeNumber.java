import jeliot.io.*;
import java.util.Scanner;

public class ComputeAverage  {
    public static void main() {
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter 3 number");
    
    double number1 = input.nextDouble();
    double number2 = input.nextDouble();
    double number3 = input.nextDouble();
    
    double Average =( number1 + number2 + number3)/ 3 ;
    System.out.println("Average "+ Average);
    
    
        
    }    
    
}