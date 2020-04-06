import jeliot.io.*;
class StrOp{

    public String value;
    
    public StrOp(String s) {
        this.value = s;
    }
    
    public char[] strToarray(){
     
       char[] ch = new char[value.length()];
      
         for(int i=0;i<ch.length;i++)
             ch[i]=value.charAt(i);
             
        return ch;
    }
}

public class MyClass {
    public static void main() {
        
        StrOp str= new StrOp("www.google.ciom");
       
        char []c =  str.strToarray();
        
          System.out.println(c);
    }
}
