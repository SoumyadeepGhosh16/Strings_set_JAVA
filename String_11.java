import java.io.*;
import java.util.*;

public class String_11 {
   public static void main(String[] args) {
    
    String str=new String("souMYAdeep");
    String str1=new String("SOUMYAdeep");
    String str2=new String("soumyaJIT");

    String str3="Ravi";

    Boolean result1=str1.equalsIgnoreCase(str);

    System.out.println("str1 is equal to str="+result1);

    Boolean result2=str2.equalsIgnoreCase(str1);

    System.out.println("str2 is equal to str="+result2);

    //can also be written as the element
    Boolean out="soumyaJIT".equalsIgnoreCase("souMYAdeep");
    System.out.println("result will be="+out);

    //compareTo() method
    System.out.println(str3.compareTo(str1));
    //compareToIgnoreCase() method
    System.out.println(str3.compareToIgnoreCase(str1));
   } 
}
