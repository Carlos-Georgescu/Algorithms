package src.linkedList.doublyLinkedList;

public class EmployeeDoublyList {

    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public void addToFront (Employee employee)
    {
        EmployeeNode node = new EmployeeNode(employee);

        //you are putting the new node right in front of the current head, YOU ARE NOT making the current node the head
        node.setNext(head);

        //the tail only changes if the the list is empty
        if(head == null)
            tail = node;
        else
            head.setPrevious(node);
        //here you are making the node that you just made the head
        head = node;
        size ++;
    }
    public void addToEnd(Employee employee)
    {
        EmployeeNode node = new EmployeeNode(employee);
        if(tail == null)
        {
            head = node;
        }
        else{
            tail.setNext(node);
            //set the previous to the last node
            node.setPrevious(tail);
        }
        tail = node;
        size++;
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

        //this means that you are removing the only node
        if(head.getNext() == null)
            tail = null;
        else
            head.getNext().setPrevious(null);

        head = head.getNext();
        size--;

        return removeNode;
    }

    //is a image reflect of removeFromFron t
    public EmployeeNode removeFromEnd(){
        if(isEmpty())
            return null;

        EmployeeNode removeNode = tail;

        //if the list is empty
        if(tail.getPrevious() == null)
            head = null;
        else
            tail.getPrevious().setNext(null);

        tail = tail.getPrevious();

        size--;
        removeNode.setPrevious(null);
        return removeNode;
    }

    public void printList(){
        EmployeeNode current = head;
        System.out.print("Head -> ");

        //while you do not reach the end of the algorithmsLearn.algorithmsGeeksforGeeks.algoCourse.linkedList
        while(current !=null)
        {
            System.out.print(current);
            System.out.print(" <=> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}
