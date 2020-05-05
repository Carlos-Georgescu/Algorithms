package Tutoring;
import java.util.*;

public class arraysIntro {
    public static void main(String args[])
    {
        int[] testArray = {5, 1, -5, 18, 3, -10};

//        for(int i=0;i<testArray.length;i++)
//            System.out.println(testArray[i]);

        for(int num:testArray) {
            System.out.println(num);
        }
    }
}
