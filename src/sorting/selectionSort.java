package src.sorting;

public class selectionSort {
    public static void main(String args[])
    {
        int[] intArray = {5, 3, 78, 14, 7, 18};

        //puts the biggest at the right
        for(int lastUnsortedIndex= intArray.length-1; lastUnsortedIndex>0;lastUnsortedIndex--)
        {
            int largest = 0;

            //finding largest number
            for(int i=1;i<=lastUnsortedIndex;i++)
            {
                if(intArray[i]>intArray[largest])
                {
                    largest = i;
                }
            }

            swap(intArray, largest, lastUnsortedIndex);
        }


        for(int i=0;i<intArray.length;i++)
            System.out.print(intArray[i]+" ");
    }

    public static void swap(int[] array, int i, int j)
    {
        if(i==j)
            return;

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
