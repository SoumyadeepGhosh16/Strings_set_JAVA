public class String_8 {
    //substring of a string
    public static void main(String[] args) {
        
        String Str=new String("Rs 1000");

        System.out.println("the original string is:");
        System.out.println(Str);

        System.out.print("the particular substring of the main string:");
        System.out.println(Str.substring(3, 5));

        System.out.println("only using beginIndex() method of substring");
        System.out.println(Str.substring(3));
    }
}
