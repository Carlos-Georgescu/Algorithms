package src.arrays;

import java.util.HashMap;
import java.util.Map;

public class IsUnique1_1 {
    public static void main(String args[])
    {
        System.out.println(isUnique("ccarlos"));
    }
    public static boolean isUnique(String s1)
    {
        Map<Character, Integer> hash = new HashMap<Character, Integer>();
        for(int i=0;i<s1.length();i++)
        {
            hash.putIfAbsent(s1.charAt(i), i);
        }

        if(hash.size()<s1.length())
            return false;
        else
            return true;


    }
}
