package src.practiceProblems.codeForces;

/**
 * Given a list of strings strings, containing the strings "red", "green" and "blue", partition the list so that the red come before green, which come before blue.
 */
public class arrayPartitioning {
    public static void main(String args[])
    {
        String[] string = {"green", "blue", "red", "red"};
        solve(string);

    }
    public static String[] solve(String[] string) {
            int counterR = 0;
            int counterB = 0;
            int counterG = 0;

            for(int i=0;i<string.length;i++)
            {
                if(string[i].equals("green"))
                    counterG++;
                if(string[i].equals("blue"))
                    counterB++;
                if(string[i].equals("red"))
                    counterR++;
            }
            for(int i=0;i<string.length;i++)
            {
                if(counterR>0)
                {
                    string[i]="red";
                    counterR--;
                }
                else if(counterG>0)
                {
                    string[i] = "green";
                    counterG--;
                }
                else if (counterB>0)
                {
                    string[i] = "blue";
                    counterB--;
                }
            }
            return string;

        }
    }
