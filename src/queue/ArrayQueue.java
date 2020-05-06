package src.queue;


import java.util.NoSuchElementException;

public class ArrayQueue {
    private Employee[] queue;
    private int front;
    private int back;

    public ArrayQueue(int capacity)
    {
        //need to put capacity
        queue = new Employee[capacity];
    }

    public void add(Employee employee) {
        //resize array if it is full
        if (size() == queue.length-1) {
            int numItems = size();
            Employee[] newArray = new Employee[2 * queue.length];
            System.arraycopy(queue, front, newArray, 0, queue.length - front);
            //want to copy at position of number of items
            System.arraycopy(queue ,0, newArray, queue.length - front, back);
            queue = newArray;

            front = 0;
            back = numItems;


            queue[back] = employee;
            //might want to wrap back to the front of the queue
            if (back < queue.length - 1) {
                back++;
            } else {
                back = 0;
            }
        }
    }

    public Employee remove(){
        if(size() == 0)
            throw new NoSuchElementException();

        //you are removing from the front
        Employee employee = queue[front];
        queue[front] = null;

        //if the first person was at position 1, now the position 2 person will be in front
        front++;

        //optimization and we are pretty much resetting the queue
        if(size() == 0){
            front = 0;
            back = 0;
        }
        else if(front == queue.length) {
            front = 0;
        }
        return employee;
    }

    public Employee peek()
    {
        if(size() == 0)
            throw new NoSuchElementException();

        return queue[front];
    }

    public int size(){
        //if the queue hasn't wrapped, you wont have to count the items in the beginning
        if(front <= back)
            return back - front;
        else
            return back-front + queue.length;
    }

    public void printQueue(){
        if(front <= back) {
            for (int i = front; i < back; i++) {
                System.out.println(queue[i]);
            }
        }
        else{
            for(int i = front; i< queue.length;i++)
                System.out.println(queue[i]);
            for(int i=0;i<back;i++)
            {
                System.out.println(queue[i]);
            }
        }
    }
}
