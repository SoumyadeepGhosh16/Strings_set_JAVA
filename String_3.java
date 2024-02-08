import java.nio.charset.Charset;

public class String_3 {

    //string constructors 2
    public static void main(String[] args) {
       
        byte[] ascii={71,101,101,107,115};
        String str=new String(ascii);
        System.out.println(str);//Geeks

        Charset cs=Charset.defaultCharset();
        String str1 = new String(ascii, cs);
        System.out.println(str1);//Geeks

        String str2=new String(ascii,1,3);
        System.out.println(str2);//eek

        char[] ascii2={'S','O','U','M','Y','A','D','E','E','P'};
        String str3=new String(ascii2,0,6);
        System.out.println(str3);
    }
}
