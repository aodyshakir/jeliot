import jeliot.io.*;
class employee{
   public int id ;
   
    
      public boolean equals(employee temp){
              // temp.id = 5 ;
         return this.id == temp.id ;
      }
}
public class MyClass {
    public static void main() {
       employee e = new employee();
       
       employee e2 = new employee();
       
       
       
       
        if( e.equals(e2)) {
            System.out.println("equals");
           
        }else {
             System.out.println(" ! equals");
        }
    }
}
