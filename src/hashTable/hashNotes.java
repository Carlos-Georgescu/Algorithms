package src.hashTable;

public class hashNotes {
    /*

    different types of collision resolution

    1. Chaining -> Every slot has a linkedlist that is being added to whenever a collision is happening
        -> Insertion is o(1) and search is o(1+a)

     2. Linear Probing (Open Addressing)
        -> When there is collision, the element is moved to the closest slot to the right of the initial needed slot
        -> Checks the element on the right until they find an empty one

     3. Double Hashing
        -> This kind of collision resolution uses a second hash function
        -> Uses one hash function to index into the table and then keeps stepping forward (by a certain interval) until the desired location is found



     */
}
