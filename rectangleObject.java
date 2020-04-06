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
public class testRecrangle {
    public static void main() {
       int a , b ;
       a = 4;
       b=a;
       b=5;
       System.out.println(a);
      Rectangle x = new Rectangle();
      Rectangle y = new Rectangle();
      x.length = 10;
      x.width= 5;
      //garbage object
      y = x ;
      y.length = 50 ;
      System.out.println(x.length);
     
      
      
    }
}
