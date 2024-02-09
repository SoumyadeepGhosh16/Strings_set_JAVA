public class String_12 {
    public static void main(String[] args) {
        
        String s1="  Soumyadeep Ghosh   ";

        System.out.println("Before Trim() - "); 
        System.out.println("String - " + s1);
        System.out.println("length -"+s1.length());

        String s2=s1.trim();

        System.out.println("\nAfter Trim() - "); 
        System.out.println("String - " + s2); 
        System.out.println("Length - " + s2.length());

        if(s1==s2){
            System.out.println("\nEqual");
        }else{
            System.out.println("\nNot Equal");
        }
        //replace() method
        String s3=s2.replace('d', 'j');
        String s4=s3.replace("p", "t");

        System.out.println(s4);
        //contains() method
        System.out.println(s4.contains("Ghosh"));

        System.out.println(s4.contains("Roy"));

        //startsWith() method
        System.out.print(
            "Check whether string starts with ghosh at pos 0 : ");
        System.out.println(s4.startsWith("Ghosh",0));
    }
}
