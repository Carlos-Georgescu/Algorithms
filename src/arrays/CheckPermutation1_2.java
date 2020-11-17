package src.arrays;

import java.util.HashMap;
import java.util.Map;

public class CheckPermutation1_2 {
    public static void main(String args[])
    {
        System.out.println(checkPermutation("alcd","dcab"));
    }
    public static boolean checkPermutation(String s1, String s2)
    {
        Map<Character, Integer> hash = new HashMap<Character, Integer>();

        if(s1.length()!=s2.length())
            return false;

        for(int i=0;i<s1.length();i++)
        {
            hash.put(s1.charAt(i),i);
        }
        for(int i=0;i<s1.length();i++)
        {
            hash.putIfAbsent(s2.charAt(i), s1.length()+i);
        }

        if(hash.size() != s1.length())
            return false;
        else
            return true;
    }
}
