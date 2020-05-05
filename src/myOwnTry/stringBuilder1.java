package myOwnTry;
import java.util.*;
public class stringBuilder1 {
    public static void main(String args[])
    {
        String s1 = new String("hello");
        StringBuilder builder = new StringBuilder(s1);

        builder.append('a');
        builder.append('b');
        builder.append('c');

//        builder.setCharAt(1, 'z');
//        builder.insert(1, "hello");
//        builder.delete(0, 1);
//
//        for(int i=0;i<builder.length();i++)
//            System.out.println(builder.charAt(i));

        System.out.println(builder.toString());
    }
}
