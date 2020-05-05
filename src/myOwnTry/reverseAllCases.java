package myOwnTry;
import java.util.*;
public class reverseAllCases {
    public static void main(String args[])
    {
        String s1 = "aTbEpggdgEEEE";

        StringBuilder sb = new StringBuilder(s1);

        for(int i=0;i<sb.length();i++) {
            if(Character.isLowerCase(sb.charAt(i)))
                sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
            else
                sb.setCharAt(i, Character.toLowerCase(sb.charAt(i)));

        }

        System.out.println(sb.codePointAt(1));
    }
}
