package src.arrays;

import java.util.HashMap;
import java.util.Map;

public class PalindromePermutation1_4 {
    public static void main(String args[])
    {
        System.out.println(permutation("Tact Cao"));
    }
    public static boolean permutation(String s1)
    {
        s1 = s1.toLowerCase();
        int counter = 0;
        Map<Character, Integer> hash = new HashMap<Character, Integer>();

        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i) != ' ') {
                hash.putIfAbsent(s1.charAt(i), i);
                counter++;
            }
        }

        //System.out.println(hash.size());

        if(counter%2==0)
        {
            if(hash.size()==counter/2)
                return true;
            else
                return false;
        }
        else{
            if(hash.size()==counter/2+1)
                return true;
            else
                return false;
        }
    }
}
