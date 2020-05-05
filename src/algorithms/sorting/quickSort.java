package algorithmsLearn.algorithms.sorting;

public class quickSort {
    public static void main(String args[])
    {
        int[] intArray = {5, 3, 78, 14, 7, 18};

        quickSort(intArray, 0, intArray.length);

        for(int i=0;i<intArray.length;i++)
            System.out.print(intArray[i]+" ");
    }
    public static int partition(int[] input, int start, int end) {
        // This is using the first element as the pivot
        int pivot = input[start];
        int i = start;
        int j = end;

        //this while loop will end when all the elements to the right of the pivot is bigger than itself and all the elements
        //to the left of the pivot is smaller
        while (i < j) {

            // NOTE: empty loop body

            //decrement J until finding element that is smaller than pivot
            //this is going through all the elements in the input array
            while (i < j && input[--j] >= pivot);

            if (i < j) {
                input[i] = input[j];
            }

            //finding first element that is greater than the pivot
            //this is going through all the element in the input array
            //i will be added and then used the result in input[i++]
            while (i < j && input[++i] <= pivot);
            if (i < j) {
                input[j] = input[i];
            }

        }
        //when it gets out of the while loop, i will equal j and that is where the pivot should be as all the elements to the right will
        //be bigger and all the elements to the left will be smaller
        input[j] = pivot;

        //returns the pivot position in the right position
        return j;

    }
    public static void quickSort(int[] input, int start, int end)
    {
        //base case, we are dealing with a one element array
        if(end-start<2)
            return;

        //position of the element in the correct spot
        int pivotIndex = partition(input, start, end);

        //on the elements that are smaller than the last pivot
        quickSort(input, start, pivotIndex);

        //on the elements that are bigger than the last pivot
        quickSort(input, pivotIndex+1, end);
    }
}
