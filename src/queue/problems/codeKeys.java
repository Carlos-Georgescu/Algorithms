package src.queue.problems;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class codeKeys {
    //this is for the question about Queues at Chapter 15
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        String[] letters = in.nextLine().split("");

        Queue<Integer> keyValues = new LinkedList<>();

        keyValues.add(3);
        keyValues.add(1);
        keyValues.add(7);
        keyValues.add(4);
        keyValues.add(2);
        keyValues.add(5);
        int asciiNum;
        StringBuilder newString = new StringBuilder();
        for(int i=0;i<letters.length;i++)
        {
            if(letters[i].equals(" "))
            {
                newString.append(" ");
            }
            else {
                 asciiNum = (int) letters[i].charAt(0);

                //novanjghl mu urxlv
                asciiNum = asciiNum - keyValues.peek();

                if(asciiNum<97)
                    asciiNum += 26;

                //convert aschiinum to char
                newString.append(Character.toString((char) asciiNum));

                keyValues.add(keyValues.remove());
            }
        }
        System.out.println(newString.toString());
    }
}
