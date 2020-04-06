import jeliot.io.*;
import java.util.Scanner;
public class Student{
private String  name;
private int age;
    // constoctor
 Student(String name , int age){
    this.name = name;
    this.age = age;
 }
 
 // method , services
 public void setNameAndAge(String name , int age){
    this.name = name;
    this.age = age;
    }
 public void intruduce(){
      System.out.println("hi i'am "+name+" my age is "+ age);
   }   
 }

public class testStudent {
    public static void main() {
       Scanner reader = new Scanner(System.in);
       int size = reader.nextInt();
      Student[] st = new Student[size];
      for(int i=0;i<st.length;i++){
    
      st[i] = new Student(reader.nextLine() ,reader.nextInt());  
       
        
        } 
        
           st[0]. intruduce(); 
        // st[1]. intruduce(); 
           
           
      
    }
}
