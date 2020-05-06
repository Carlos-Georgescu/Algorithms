package src.sorting;

public class bubbleSort {
    public static void main(String[] args)
    {
        int[] intArray = {5, 3, 78, 14, 7, 18};

        boolean found = true;

        while(found==true)
        {
            found = false;
            for(int i=0;i<intArray.length-1;i++)
            {
                if(intArray[i]>intArray[i+1]) {
                    found = true;
                    swap(intArray, i, i+1);
                }
            }
        }

        for(int i=0;i<intArray.length;i++)
            System.out.print(intArray[i]);

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
