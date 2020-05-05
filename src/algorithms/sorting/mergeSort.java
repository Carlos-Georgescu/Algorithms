package algorithmsLearn.algorithms.sorting;

public class mergeSort {
    public static void main(String args[])
    {
        int[] intArray = {5, 3, 78, 14, 7, 18};

        mergeSort(intArray, 0, intArray.length);

        for(int i=0;i<intArray.length;i++)
            System.out.print(intArray[i]+" ");
    }
    public static void mergeSort(int[] input, int start, int end)
    {
        //for one element arrays
        if(end-start<2)
            return;

        int mid = (start+end) /2 ;

        //we are always referencing the start array so that it why its the same
        //all left side of all the algorithmsLearn.algorithmsGeeksforGeeks.algoCourse.recursive arrays
        mergeSort(input, start, mid);
        //right part of the array
        //the end index is always 1 bigger
        mergeSort(input, mid, end);

        merge(input, start, mid, end);
    }


    public static void merge(int[] input, int start, int mid, int end)
    {
        //this is saying that if the biggest value of the left array is smaller than the smallest value of the right array,
        //you do not have to do anything
        //end is the start of the right array
        if(input[mid-1] <= input[mid])
            return;

        int i = start;
        int j = mid;
        int tempIndex = 0;

        //making new array that is the size of both of the past arrays combined
        int[] temp = new int[end-start];

        //adding to new array
        while(i<mid &&j<end)
        {
            //you add the smaller equal so that the algorithm remains stable
            if(input[i]<=input[j])
            {
                temp[tempIndex] = input[i];
                i++;
            }
            else
            {
                temp[tempIndex] = input[j];
                j++;
            }
            tempIndex++;
        }

        //this is for the left over elements on the left array, added to the end
        System.arraycopy(input, i, input, start+tempIndex, mid-i);

        //this is overriding the input array with whatever was in temp array
        System.arraycopy(temp, 0 , input, start, tempIndex);

    }
}
