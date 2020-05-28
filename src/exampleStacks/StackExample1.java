package src.exampleStacks;

import java.util.*;
public class StackExample1 {
    public static void main(String args[])
    {
       Scanner in = new Scanner(System.in);

       int score = in.nextInt();

       switch (score / 10)
       {
           case 9:
               System.out.println("A grade");
               break;
           case 8:
               System.out.println("B grade ");
               break;
           case 7:
               System.out.println("C grade ");
               break;
           default:
               System.out.println("D grade and below");
       }
    }
}
