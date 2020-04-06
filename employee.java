import jeliot.io.*;
import java.util.Scanner;  // Import the Scanner class
public class employee {
    private String fname ;
    private String lname ;
    private double salary ;
    private int id ;
    
    
    public double IncSalary(String job ,double bonus) {
         
        int incVal = 0;
        if(job.equals("manager") )
            incVal = 1000;
        else if (job.equals("employee"))
            incVal = 500;
        
        double newSalary = salary + incVal * (1 + bonus /100);
        
        // call method
        setSalary(newSalary);
        
        return  newSalary;
    }
 
   public double calcSalary(int hours , double otph){
      double newsal = salary;
      if (hours > 40){
         int addHoours = hours - 40 ;
         double addsal = addHoours * otph ;
         newsal += addsal;
       }
        return newsal;
   }
   
   
     

    public String getFname() {
        return fname;
    }
    public void setFname(String fname) {
        this.fname = fname;
    }
    public String getLname() {
        return lname;
    }
    public void setLname(String lname) {
        this.lname = lname;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double sal) {
        if(sal >= 5000 && sal <= 20000)
     
          this.salary = sal;
       }
        
    
    public int getId() {
        return id;
    }
    public void setId(int d) {
      if (d >= 1000 && d <= 9999)
        this.id = d;
    }
}

public class testEmployee {
    public static void main() {
         Scanner reader = new Scanner(System.in);
         employee e = new employee();
         double sal = reader.nextDouble();
           e.setSalary(sal);
        // int id =reader.nextInt();
       //  e.setId(id) ;
       // double newSal=e.calcSalary(reader.nextInt(),reader.nextDouble());
       System.out.println(e.IncSalary("manager", 15));
        
        
    }
}
