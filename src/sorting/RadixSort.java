package src.sorting;

public class RadixSort {
    public static void main(String args[])
    {
        int[] radixArray = {4725, 4586, 1330, 8792, 1594, 5729};

        radixSort(radixArray, 10, 4);

        for(int i=0;i<radixArray.length;i++)
            System.out.print(radixArray[i]+" ");
    }

    public static void radixSort(int[] input, int radix, int width)
    {
        //the width is how many digits the number has
        for(int i=0;i<width;i++)
        {
            radixSingleSort(input, i, radix);
        }
    }

    public static void radixSingleSort(int[] input, int position, int radix)
    {
        int numItems = input.length;

        //counting how many of each digit there is
        int[] countArray = new int[radix];

        for(int value: input)
            //you are adding to the location of the value of the digit
            countArray[getDigit(position, value, radix)]++;

        //ajust the count array
        for(int j=1; j<radix; j++)
        {
            countArray[j] += countArray[j-1];
        }

        int[] temp = new int[numItems];

        for(int tempIndex = numItems-1; tempIndex>=0; tempIndex--)
        {
            temp[--countArray[getDigit(position, input[tempIndex], radix)]] = input[tempIndex];
        }

        //copy to original array
        for(int tempIndex = 0; tempIndex< numItems; tempIndex++)
            input[tempIndex] = temp[tempIndex];
    }

    public static int getDigit(int position, int value, int radix)
    {
        return value / (int) Math.pow(radix, position) % radix;
    }
}
