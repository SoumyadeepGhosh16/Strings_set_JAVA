public class String_7 {
    public static void main(String[] args) {
        
        String str="Mathematics";
        int count=0;

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='e'){
                 count++;
            }
        }   
        //printing the number of occurence
        System.out.println("counting the occurence of e:"+count);
        
    }
}
