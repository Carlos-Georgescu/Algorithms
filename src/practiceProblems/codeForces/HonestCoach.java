package src.practiceProblems.codeForces;

import java.util.*;

public class HonestCoach {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        int tt = in.nextInt();

        while(tt>0)
        {
            int n = in.nextInt();
            int max1 = in.nextInt();
            int max2 = Integer.MIN_VALUE;

            for(int i=1;i<n;i++)
            {
                int num = in.nextInt();
                if(num>max1)
                {
                    max2 = max1;
                    max1 = num;
                }
                else if(num>max2)
                {
                    max2 = num;
                }
            }
            System.out.println(max1-max2);
            tt--;
        }
    }
}
