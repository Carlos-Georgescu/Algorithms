//package src.arrays;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class PalindromePermutation1_4 {
//    public static void main(String args[])
//    {
//        System.out.println(permutation("Tcct Cco"));
//    }
//    public static boolean permutation(String s1)
//    {
//        s1 = s1.toLowerCase();
//        int counter = 0;
//        Map<Character, Integer> hash = new HashMap<Character, Integer>();
//
//        for(int i=0;i<s1.length();i++)
//        {
//            if(s1.charAt(i) != ' ') {
//                if(hash.containsValue(s1.charAt(i)))
//                    hash.put(s1.charAt(i),hash.get(s1.charAt(i)));
//                else
//                    hash.put(s1.charAt(i),i);
//                counter++;
//            }
//        }
//
//        //System.out.println(hash.size());
//
//        int counter2 = 0;
//
//        for(int i=0;i<hash.size();i++)
//            //if(hash.get(i).)
//    }
//}
