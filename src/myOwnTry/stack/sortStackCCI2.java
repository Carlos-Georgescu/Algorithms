package myOwnTry.stack;

import java.util.Stack;

//this is the more advanced sorting with only 2 stacks
public class sortStackCCI2 {
    public static void main(String args[])
    {
        Stack<Integer> givenStack = new Stack<Integer>();
        Stack<Integer> sortedStack = new Stack<Integer>();

        givenStack.add(5);
        givenStack.add(2);
        givenStack.add(10);
        givenStack.add(-3);
        givenStack.add(8);
        givenStack.add(16);
        givenStack.add(1);
        givenStack.add(-14);

        int size = givenStack.size();

        //add first element
        sortedStack.add(givenStack.pop());

        for(int i=1;i<size;i++)
        {
            int number = givenStack.peek();
            //this is the counter on how many elements were popped
            int counter = 0;
            while(!sortedStack.isEmpty() && number>sortedStack.peek())
            {
                counter++;
                givenStack.push(sortedStack.pop());
            }
            sortedStack.add(number);

            for(int j=0;j<counter;j++)
                sortedStack.add(givenStack.pop());

            givenStack.pop();
        }

        for(int i=0;i<size;i++)
            System.out.print(sortedStack.pop()+" ");
    }
}
