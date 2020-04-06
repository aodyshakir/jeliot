import jeliot.io.*;
class Rectangle{
 //attributes, properties,fields,data members
  public int length ;
  public int width ;
  public int area;
  //method
  public void computArea(){
    area = length*width;
  }
  // method
  public void printArea(){
    System.out.println("area = "+area);
 }
 
}
public class TestRectangle {
    public static void main() {
     
       
       Rectangle x = new Rectangle();
       x.length = 10;
       x.width = 4;
       x.computArea();
       x.printArea();
       
       }
       }
