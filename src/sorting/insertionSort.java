package src.sorting;

public class insertionSort {
    public static void main(String args[])
    {
        int[] intArray = {5, 3, 78, 14, 7, 18};

        //the first index is automatically sorted in the sorted position
        for(int firstSortedIndex = 1; firstSortedIndex<intArray.length; firstSortedIndex++ )
        {
            int newElement = intArray[firstSortedIndex];

            int i;

            //trying to find where to put the second number
            for(i=firstSortedIndex; i>0 && intArray[i-1]>newElement; i--)
            {
                intArray[i] = intArray[i-1];
            }

            intArray[i] = newElement;
        }

        for(int i=0;i<intArray.length;i++)
            System.out.print(intArray[i]+" ");
    }
}
