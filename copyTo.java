import jeliot.io.*;

 class employee {
   int id ;
   String Fname ;
   String Lname ;
   double salary ;
   
   
   
   public void copyTo(employee temp ){
       temp.id = id ;
       temp.Fname = Fname ;
       temp.Lname = Lname ;
       temp.salary = salary ;
   
   }
   
    public employee makeCopy(){
           employee newemp = new employee();
           this.copyTo(newemp);
           return newemp ;
    }
   
  } 


public class MyClass {
    public static void main() {
     
        employee e = new employee();
        e.id = 24312 ;
        e.Fname = "uday";
        e.Lname = "sh";
        e.salary = 5000 ;
        
        employee e2 = e. makeCopy();
    
        

    }
}
