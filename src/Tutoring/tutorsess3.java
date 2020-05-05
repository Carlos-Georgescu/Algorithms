package Tutoring;

import java.lang.*;
public class tutorsess3 {
    public static void main(String args[])
    {
        System.out.print(toNumbers(5, 60));
    }

    public static boolean toNumbers(int number1, int number2) {
        if (Math.pow(number1, 2) > number2) {
           return true;
        } else {
            return false;
        }
    }
}
