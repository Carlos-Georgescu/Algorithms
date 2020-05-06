package src.linkedList.linkedListSDK;

import src.linkedList.doublyLinkedList.Employee;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String args[])
    {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);


        LinkedList<Employee> list = new LinkedList<>();

        //adding employee objects to likedList
        list.addFirst(janeJones);
        list.addFirst(johnDoe);
        list.addFirst(marySmith);
        list.addFirst(mikeWilson);

        //this is iterating through the arraylist
        Iterator iter = list.iterator();

        while(iter.hasNext())
            System.out.println(iter.next());

        list.removeFirst();

        System.out.println();
        iter = list.iterator();
        while(iter.hasNext())
            System.out.println(iter.next());
    }
}
