package Tutoring;
import java.util.*;
public class workWithDigits {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();

        int digit;

        ArrayList<Integer> allDigits = new ArrayList<Integer>();

        while(number!=0)
        {
            digit = number%10;

            allDigits.add(digit);

            number /= 10;
        }

//        for(int i: allDigits)
//            System.out.println(i);


        int reverseNumber = 0;
        for(int i: allDigits)
        {
            reverseNumber = (reverseNumber*10) +i;
        }

        System.out.println(reverseNumber);
    }
}
