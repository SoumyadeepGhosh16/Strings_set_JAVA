public class String_2 {

    //string constructors 1
    public static void main(String[] args) {
        byte ascii[]={71,70,71};

        String firstString=new String(ascii);
        System.out.println(firstString);

        String secondString=new String(ascii,0,2);
        System.out.println(secondString);

        char characters[]={'S','G'};

        String firstString1=new String(characters);

        String secondString1=new String(firstString1);

        System.out.println(firstString1);
        System.out.println(secondString1);
    }
}
