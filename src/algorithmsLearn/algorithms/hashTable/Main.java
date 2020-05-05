package algorithmsLearn.algorithms.hashTable;

public class Main {
    public static void main(String args[])
    {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        SimpleHashtable ht = new SimpleHashtable();

        ht.put("Jones", janeJones);
        ht.put("Doe", johnDoe);
        ht.put("Wilson", mikeWilson);
        //this will result in a collision
        ht.put("Smith", marySmith);

        ht.printHashTable();

        ht.remove("Jones");
        ht.printHashTable();


        //System.out.println("Retrieve key Wilson: "+ ht.get("Wilson"));
    }
}
