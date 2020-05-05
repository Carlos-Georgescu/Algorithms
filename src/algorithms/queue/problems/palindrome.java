package algorithmsLearn.algorithms.queue.problems;

import java.util.Deque;
import java.util.LinkedList;

public class palindrome {
    public static void main(String args[])
    {
        Deque<String> palindrome  = new LinkedList<>();

        palindrome.add("h");
        palindrome.add("e");
        palindrome.add("l");
        palindrome.add("l");
        palindrome.add("o");
//        palindrome.add("a");
//        palindrome.add("r");

        boolean isPali = true;
        while(palindrome.size()>1)
        {
            String s1 = palindrome.pollFirst().toLowerCase();
            String s2 = palindrome.pollLast().toLowerCase();


            if(!s1.equals(s2))
                isPali = false;
        }

        System.out.println(isPali);
    }
}
