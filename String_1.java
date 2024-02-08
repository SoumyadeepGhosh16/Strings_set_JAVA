import java.io.*;

public class String_1 {
    public static void main(String[] args) {
        //"new" keyword allots a seperate space in heap memory
        String str=new String("Java practice");

        //using string literal
        String str1="Java";

        //exeplicitly can be concatinated
        str=str.concat(" and implementation");

        //implicitly does not concat 
        str1.concat(" and implementation");

        System.out.println(str);
        System.out.println(str1);
    }
}
