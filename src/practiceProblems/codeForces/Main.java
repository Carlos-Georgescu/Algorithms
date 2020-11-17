package src.practiceProblems.codeForces;//package src.practiceProblems;

import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int counter = 0;
        String needle = in.next();
        String haystack = in.next();

        for(int i=0;i<needle.length();i++)
        {
            String newString = needle.substring(i) + needle.substring(0, i);

            if(haystack.contains(newString))
                counter++;
        }
        System.out.println(counter);
    }
}
