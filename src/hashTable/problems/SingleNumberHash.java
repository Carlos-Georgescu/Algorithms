package src.hashTable.problems;

import java.util.HashMap;

public class SingleNumberHash {
    public static void main(String args[])
    {
        HashMap<Integer, Integer> hash_table = new HashMap<>();
        int[] nums = new int[]{2,2,1};


        for (int i : nums) {
            hash_table.put(i, hash_table.getOrDefault(i, 0) + 1);
        }
        for (int i : nums) {
            if (hash_table.get(i) == 1) {
                System.out.println(i);
            }
        }


//        hashTable.put(5,10);
//        hashTable.put(5,10);
//
//        System.out.println(hashTable.get(5));
    }
}
