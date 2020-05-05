package myOwnTry.stack;
import java.util.*;
import java.lang.*;
public class postFixExpression {
    //this comes from figure 14.5, evaluating postfix expressions
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        String[] string = in.nextLine().split(" ");
        Stack<Integer> stack = new Stack<Integer>();

        for(int i=0;i<string.length;i++)
        {
            if(string[i].equals("*") || string[i].equals("/") || string[i].equals("-") || string[i].equals("+"))
            {
                int num1 = stack.pop();
                int num2 = stack.pop();
                stack.push(calc(num2, num1, string[i]));
            }
            else{
                stack.push(Integer.parseInt(string[i]));
            }
        } //12 2 5 + - 4 * 2 /
        System.out.println(stack.pop());
    }
    public static int calc (int num1, int num2, String c)
    {
        if(c.equals("*"))
            return num1*num2;
        if(c.equals("+"))
            return num1+num2;
        if(c.equals("/"))
            return num1/num2;
        else
            return num1-num2;
    }
}
