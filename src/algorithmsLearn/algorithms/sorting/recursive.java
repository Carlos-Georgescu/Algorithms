package algorithmsLearn.algorithms.sorting;

public class recursive {
    public static void main(String args[])
    {
        System.out.print(recursiveFactorial(5));
    }

    public static int recursiveFactorial(int num)
    {
        if(num==0)
            return 1;

        return num* recursiveFactorial(num-1);
    }
}
