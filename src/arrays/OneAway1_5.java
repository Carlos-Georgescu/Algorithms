package src.arrays;

import java.util.HashMap;
import java.util.Map;

public class OneAway1_5 {
    public static void main(String args[])
    {
        System.out.println(oneWay("pale", "prre"));
    }

    public static boolean oneWay(String s1, String s2)
    {
        Map<Character, Integer> hash = new HashMap<Character, Integer>();
        for(int i=0;i<s1.length();i++)
            hash.put(s1.charAt(i),i);
        for(int i=0;i<s2.length();i++)
            hash.putIfAbsent(s2.charAt(i),s1.length()+1);

        if(s2.length()+1 == s1.length() || s2.length()-1==s1.length())
            if(hash.size()!=s1.length())
                return false;
            else
                return true;
        else if (s1.length()==s2.length())
            if(hash.size()>s1.length()+1)
                return false;
            else
                return true;
        else
            return false;
    }
}
