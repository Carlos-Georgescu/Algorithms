package src.hashTable.Chaining;

import java.util.LinkedList;
import java.util.ListIterator;


//this is demonstrating a method of handling hashtable collisions with chaining

public class ChainedHastable {

    private LinkedList<StoredEmployee>[] hashtable;

    public ChainedHastable(){
        hashtable = new LinkedList[10];
        for(int i=0;i<hashtable.length;i++)
        {
            //new instance of LinkedList in every position
            hashtable[i] = new LinkedList<StoredEmployee>();
        }
    }

    public void put(String key, Employee employee)
    {
        //hashing the key
        int hashedKey  = hashKey(key);

        hashtable[hashedKey].add(new StoredEmployee(key, employee));
    }

    public src.hashTable.linearProbing.Employee get(String key)
    {
        int hashedKey = hashKey(key);

        //use a ListIterator because you are iterating through a linkedList
        ListIterator<StoredEmployee> iterator = hashtable[hashedKey].listIterator();
        StoredEmployee employee = null;
        while(iterator.hasNext())
        {
            employee = iterator.next();
            if(employee.key.equals(key)) {
                return employee.employee;
            }
        }
        return null;
    }

    public src.hashTable.linearProbing.Employee remove(String key){
        int hashedKey = hashKey(key);

        //use a ListIterator because you are iterating through a linkedList
        ListIterator<StoredEmployee> iterator = hashtable[hashedKey].listIterator();
        StoredEmployee employee = null;
        int index = 0;
        while(iterator.hasNext())
        {
            employee = iterator.next();
            index++;
            if(employee.key.equals(key)) {
                return employee.employee;
            }
        }

        if(employee ==null || !employee.key.equals(index))
        {
            //the employee value will be null if it is not found
            return null;
        }
        else
        {
            hashtable[hashedKey].remove(employee);
            return employee.employee;
        }
    }

    private int hashKey(String key)
    {
        return key.length() % hashtable.length;
    }

    public void printHashtable(){
        for(int i=0;i<hashtable.length;i++)
        {
            if(hashtable[i].isEmpty())
                System.out.println("Position "+i+": empty");
            else{
                //traverse the list
                System.out.println("Position "+i+": ");
                ListIterator<StoredEmployee> iterator = hashtable[i].listIterator();
                while(iterator.hasNext())
                {
                    System.out.print(iterator.next().employee);
                    System.out.print("->");
                }
                System.out.println("null");
            }
        }
    }
}
