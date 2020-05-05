package algorithmsLearn.algorithms.linkedList;

public class EmployeeLinkedList {

    private EmployeeNode head;
    private int size;

    public void addToFront (Employee employee)
    {
        EmployeeNode node = new EmployeeNode(employee);

        //you are putting the new node right in front of the current head, YOU ARE NOT making the current node the head
        node.setNext(head);

        //here you are making the node that you just made the head
        head = node;
        size ++;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty()
    {
        return head == null;
    }

    //returns the employee node that was removed
    public EmployeeNode removeFromFront(){
        //if there is nothing in the list, it won't do anything
        if(isEmpty())
            return null;

        EmployeeNode removeNode = head;
        head = head.getNext();
        size--;

        return removeNode;
    }


    public void printList(){
        EmployeeNode current = head;
        System.out.print("Head -> ");

        //while you do not reach the end of the algorithmsLearn.algorithmsGeeksforGeeks.algoCourse.linkedList
        while(current !=null)
        {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
    }
}
