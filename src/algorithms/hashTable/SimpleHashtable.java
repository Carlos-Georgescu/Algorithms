package algorithmsLearn.algorithms.hashTable;

public class SimpleHashtable {

    //array to back the hashtable
    private StoredEmployee[] hashtable;

    public SimpleHashtable(){
        hashtable = new StoredEmployee[10];
    }

    //with hashtables, we are always working with key & value pairs
    public void put(String key, Employee employee)
    {
        //this is the hashed key value
        int hashedKey = hashKey(key);

        //not we are going to check if the current position that we want to insert already has a number
        if(occupied(hashedKey))
        {
            //we have to do linear probing
            int stopIndex = hashedKey;

            if(hashedKey== hashtable.length-1)
            {
                hashedKey = 0;
            }
            else{
                hashedKey++;
            }
            //while there is a something at the current hashKey value
            while(occupied(hashedKey) && hashedKey!=stopIndex)
            {
                //this solves the wrapping around problem because when the hashkey reaches the end, it gets moded by the length and equal 0
                hashedKey = (hashedKey+1) % hashtable.length;
            }
        }
        //if there is already something in the current spot (for collisions)
        //FOR COLLISIONS: now if you go through the whole array and do not find, then the whole array is full
        if(occupied(hashedKey)){
            System.out.println("Sorry, there's already an employee at position: "+hashedKey);
        }
        else{
            hashtable[hashedKey] = new StoredEmployee(key, employee);
        }
    }

    //get function to get the employee wanted
    public Employee get(String key)
    {
        //convert key into into
        int hashKey = findKey(key);
        //if it doesnt exist
        if(hashKey == -1)
            return null;
        return hashtable[hashKey].employee;
    }

    public Employee remove(String key)
    {
        int hashedKey = findKey(key);
        //there is not employee to remove with that key
        if(hashedKey ==-1)
            return null;

        Employee employee = hashtable[hashedKey].employee;
        hashtable[hashedKey] = null;

        StoredEmployee[] oldHashTable = hashtable;
        //pointing to something else
        hashtable = new StoredEmployee[oldHashTable.length];
        for(int i=0;i<oldHashTable.length;i++)
        {
            if(oldHashTable[i]!=null)
                put(oldHashTable[i].key,oldHashTable[i].employee);
        }

        return employee;
    }

    private int findKey(String key) {
        int hashedKey = hashKey(key);

        if ((hashtable[hashedKey] != null) && (hashtable[hashedKey].key.equals(key))) {
            return hashedKey;
        }

        //you gotta do linear probing (same as put method)

        //we have to do linear probing
        int stopIndex = hashedKey;

        if (hashedKey == hashtable.length - 1) {
            hashedKey = 0;
        } else {
            hashedKey++;
        }
        //while there is a something at the current hashKey value

        //hashtable[hashedKey]!=null is very important, essencially we stop there as the hashkey is going to be at the fist avaiable spot
        //meaning that if we hit a null, the value should've been there before
        while (hashedKey!=stopIndex && hashtable[hashedKey]!=null && !hashtable[hashedKey].key.equals(key)) {
            //as long as the current key is not
            hashedKey = (hashedKey + 1) % hashtable.length;
        }

        if(hashtable[hashedKey]!=null && hashtable[hashedKey].key.equals(key))
            return hashedKey;
        else
            return -1;
    }

    //taking String and putting it into an int
    //key can be anything but the hash value has to be an int
    private int hashKey(String key)
    {
        return key.length() % hashtable.length;
    }

    private boolean occupied(int index)
    {
        return hashtable[index] != null;
    }

    public void printHashTable(){
        for(int i=0;i<hashtable.length;i++) {
            if(hashtable[i]==null)
                System.out.println("null");
            else
                System.out.println(hashtable[i].employee);
        }
    }
}
