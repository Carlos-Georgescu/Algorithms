package src.sorting;

public class insertionSortRecursive {
    public static void main(String args[])
    {
        int[] intArray1 = {5, 3, 78, 14, 7, 18};

        insertionSort(intArray1, 1);

        for(int i=0;i<intArray1.length;i++)
            System.out.print(intArray1[i]+" ");
    }
    public static void insertionSort(int intArray[], int position)
    {
        //base case
       // if(position)





//        //the first index is automatically sorted in the sorted position
//        for(int firstSortedIndex = 1; firstSortedIndex<intArray.length; firstSortedIndex++ )
//        {
//            int newElement = intArray[firstSortedIndex];
//
//            int i;
//
//            //trying to find where to put the second number
//            for(i=firstSortedIndex; i>0 && intArray[i-1]>newElement; i--)
//            {
//                intArray[i] = intArray[i-1];
//            }
//
//            intArray[i] = newElement;
//        }
    }
}
