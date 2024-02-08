public class String_9 {

    public static boolean vowel(char c){
        return "aeiouAEIOU".indexOf(c)>=0;
    }
    public static void main(String[] args) {
        String Str=new String("Java tutorial");

        String subst=new String("tutor");

        System.out.println("found subst in the main string:");
        System.out.println(Str.indexOf(subst,0));

        boolean isVowel=vowel('F');

        if(isVowel){
            System.out.println("Vowel");
        }else{
            System.out.println("Consonant");
        }
    }
}
