package myOwnTry.stack;
import java.util.*;
public class stackCountParenthese {
    public static void main(String args[])
    {
        Stack<Character> stackChar  = new Stack<Character>();

        Scanner in = new Scanner(System.in);

        String line = in.nextLine();
        boolean isBalenced = true;

        //add all chars to stack
        for(int i=0;i<line.length();i++)
        {
            if(line.charAt(i) == '(')
                stackChar.push(line.charAt(i));
            else {
                if (stackChar.isEmpty())
                    isBalenced = false;
                else
                    stackChar.pop();
            }
        }

        if(isBalenced==false)
            System.out.println("Not baleneced ");
        else if(stackChar.isEmpty())
            System.out.println("It is balenced");
        else
            System.out.println("Not baleneced ");

    }
}
