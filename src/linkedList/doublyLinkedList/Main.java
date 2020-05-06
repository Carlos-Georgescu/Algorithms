package src.linkedList.doublyLinkedList;

public class Main {
    public static void main(String args[])
    {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);


        EmployeeDoublyList list = new EmployeeDoublyList();

        //adding employee objects to likedList
        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);

        System.out.println(list.getSize());

        list.printList();

        Employee billEnd = new Employee("Bill", "End", 78);
        list.addToEnd(billEnd);
        list.printList();
        System.out.println(list.getSize());
        list.removeFromFront();
        list.printList();
        System.out.println(list.getSize());
        list.removeFromEnd();
        list.printList();
        System.out.println(list.getSize());
    }
}
