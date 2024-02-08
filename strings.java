import java.util.*;
public class strings {
    public static void main(String[] args){
    StringBuilder sb=new StringBuilder("Soumyadeep");
    System.out.println(sb);

    System.out.println(sb.charAt(0));

    sb.setCharAt(4,'a');
    System.out.println(sb);

    sb.insert(4,'y');
    System.out.println(sb);

    sb.delete(5,6);
    System.out.println(sb);

    sb.append(" ");
    sb.append("G");
    sb.append("h");
    sb.append("o");
    sb.append("s");
    sb.append("h");
    System.out.println(sb);

    sb.reverse();
    System.out.println(sb);
    
    }
}
