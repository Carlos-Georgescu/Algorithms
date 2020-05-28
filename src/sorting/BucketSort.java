package src.sorting;
import java.util.*;
public class BucketSort {
    public static void main(String  args[])
    {
        int[] intArray = {54, 46, 83, 66, 95, 92, 43};

        bucketSort(intArray);

        for(int i=0;i<intArray.length;i++)
            System.out.println(intArray[i]);
    }
    public static void bucketSort(int[] input){
        List<Integer>[] buckets = new List[10];

        for(int i=0;i<buckets.length;i++)
        {
            //you can use LinkedList and ArrayList as the buckets
            buckets[i] = new ArrayList<Integer>();
        }

        //hash each value and put in appropiate bucket
        for(int i=0;i<input.length;i++)
        {
            //add the value to the hashed position
            buckets[hash(input[i])].add(input[i]);
        }

        for(List bucket: buckets)
        {
            Collections.sort(bucket);
        }

        int j = 0;
        for(int i=0;i<buckets.length;i++)
        {
            //inner loop is traversing the arraylist
            for(int value : buckets[i]) {
                input[j++] = value;
            }
        }
    }

    private static int hash(int value)
    {
        return value / (int) 10;
    }
}
