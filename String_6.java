public class String_6 {
    public static void main(String[] args) {
        
        String str="Engineering";

        System.out.println("Odd position");
        for(int i=0;i<str.length();i+=2){
            System.out.print(str.charAt(i));
        }

        System.out.println("\n");

        for(int i=1;i<str.length();i+=2){
            System.out.print(str.charAt(i));
        }
    }
}
