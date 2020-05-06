package src.sorting;

public class countingSort {
    public static void main(String args[])
    {
        int[] intArray = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3};

        countingSort(intArray, 1, 10);

        for(int i=0;i<intArray.length;i++)
            System.out.print(intArray[i]);

    }
    public static void countingSort(int[] input, int min, int max)
    {
       int[] countArray = new int[(max-min)+1];

       for(int i=0;i<input.length;i++)
       {
           countArray[input[i]-min]++;
       }

       int j=0;
       for(int i=min;i<=max;i++)
       {
           //go through how many of each value and put it in the new array
           while(countArray[i-min]>0)
           {
               input[j++] = i;
               countArray[i-min]--;
           }
       }
    }
}
