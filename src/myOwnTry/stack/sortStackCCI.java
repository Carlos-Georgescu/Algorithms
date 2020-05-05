package myOwnTry.stack;
import java.util.*;
public class sortStackCCI {
    public static void main(String args[])
    {
        //first we will implement the algorithm with 3 stacks
        Stack<Integer> givenStack = new Stack<Integer>();
        Stack<Integer> sortedStack = new Stack<Integer>();
        Stack<Integer> tempStack = new Stack<Integer>();

        givenStack.add(5);
        givenStack.add(2);
        givenStack.add(10);
        givenStack.add(-3);
        givenStack.add(8);
        givenStack.add(16);
        givenStack.add(1);
        givenStack.add(-14);

        int size = givenStack.size();
        int min = Integer.MAX_VALUE;
        int lastMin = Integer.MIN_VALUE;
        //we are supposing that there is any duplicant values
        while(sortedStack.size()<size)
        {
            for(int i=0;i<size;i++)
            {
                if(givenStack.peek()<min && givenStack.peek()>lastMin)
                    min = givenStack.peek();

                tempStack.add(givenStack.pop());
            }
            sortedStack.add(min);
            lastMin = min;
            min = Integer.MAX_VALUE;

            //put elements back into givenStack
            for(int i=0;i<size;i++)
                givenStack.add(tempStack.pop());
        }
        for(int i=0;i<size;i++)
            System.out.print(sortedStack.pop()+" ");
    }
}
