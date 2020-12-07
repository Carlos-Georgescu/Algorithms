package src.hashTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class hashNotes {
    /*

    different types of collision resolution

    Every key only exists at most once
     Hashmaps are built on Array, <Key, Value> pair
     Whenever you find a value, its 0(1)


    1. Chaining -> Every slot has a linkedlist that is being added to whenever a collision is happening
        -> Insertion is o(1) and search is o(1+a)

     2. Linear Probing (Open Addressing)
        -> When there is collision, the element is moved to the closest slot to the right of the initial needed slot
        -> Checks the element on the right until they find an empty one

     3. Double Hashing
        -> This kind of collision resolution uses a second hash function
        -> Uses one hash function to index into the table and then keeps stepping forward (by a certain interval) until the desired location is found


     To Learn:
      - Set
      - TreeSet, Hashset


     */

    public static void main(String args[])
    {
        HashMap<Integer, HashMap<Integer, Integer>> hash = new HashMap<Integer, HashMap<Integer, Integer>>();



    }
}
