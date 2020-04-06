import jeliot.io.*;

public class MyClass {
    public static void main() {
      String s = "welcome" ;
      
      int len = s.length() ;
      String rev = "";
      for(int i=len-1;i>=0 ;i--)
        rev += s.charAt(i);
      System.out.println(rev);

    }
}
