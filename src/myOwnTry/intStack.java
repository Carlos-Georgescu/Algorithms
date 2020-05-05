package myOwnTry;
import java.util.*;
public class intStack {
    public static void main(String args[])
    {
        Stack<Integer> newStack = new Stack<Integer>();

        newStack.add(4);
        newStack.add(6);

        for(Integer item : newStack)
            System.out.println(item);
    }
}
