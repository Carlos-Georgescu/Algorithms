package src.String;
/*
You are given two strings s and t of equal length only consisting of lowercase letters.
Assuming that you can first rearrange s into any order,
return the minimum number of changes needed to turn s into t.
 */
public class MinimumString {
    public static void main(String args[]){
        System.out.println(solve("ehyor", "hello"));
    }

    public static int solve(String s, String t)
    {
        int[] arr  = new int[26];

        for(char c : s.toCharArray())
            arr[c - 'a']++;
        for(char c: t.toCharArray())
            arr[c - 'a']--;

        int counter = 0;

        for(int i=0;i<26;i++)
            if(arr[i]>0)
                counter += arr[i];

        return counter;
    }
}
