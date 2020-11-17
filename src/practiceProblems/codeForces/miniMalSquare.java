package src.practiceProblems.codeForces;
import java.util.*;

public class miniMalSquare {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        int tt = in.nextInt();

        while(tt>0)
        {
            int n1 = in.nextInt();
            int n2 = in.nextInt();

            if(n1<n2) {
                if (n1*2<n2)
                    System.out.println(n2*n2);
                else
                    System.out.println(n1*2*n1*2);
            }
            else {
                if(n2*2<n1)
                    System.out.println(n1 * n1);
                else
                    System.out.println(n2*2*n2*2);
            }
            tt--;
        }

    }
}
