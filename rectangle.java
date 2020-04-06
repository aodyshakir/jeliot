import jeliot.io.*;
import java.util.Scanner;

class Rectangle{
 //attributes, properties,fields,data members
  public int length ;
  public int width ;
  public int area;

  // method
  public void printArea(){
    System.out.println("area = "+area);
 }

}
public class TestRectangle {
    public static void main() {
       Scanner reader = new Scanner(System.in);
       
       Rectangle rec = new Rectangle();
       rec.length = reader.nextInt();
       rec.width = reader.nextInt();
       rec.area = rec.length*rec.width ;
       rec.printArea();
       
       Rectangle rec1 = new Rectangle();
       rec1.length = reader.nextInt();
       rec1.width = reader.nextInt();
       rec1.area = rec1.length*rec1.width ;
       rec1.printArea();
       
       Rectangle rec2 = new Rectangle();
       rec2.length = reader.nextInt();
       rec2.width = reader.nextInt();
       rec2.area = rec2.length*rec2.width ;
       rec2.printArea();
       
       Rectangle rec3 = new Rectangle();
       rec3.length = reader.nextInt();
       rec3.width = reader.nextInt();
       rec3.area = rec3.length*rec3.width ;
       rec3.printArea();

    }
}
