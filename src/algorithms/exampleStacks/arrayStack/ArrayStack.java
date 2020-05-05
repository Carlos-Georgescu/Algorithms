package algorithmsLearn.algorithms.exampleStacks.arrayStack;

import java.util.EmptyStackException;

public class ArrayStack {
    private Employee[] stack;
    //contains index of the next available position in the array
    //when you want to access the most top item, you need to access it by (top-1)
    private int top;

    public ArrayStack(int capacity)
    {
        //add new employee to stack
        stack = new Employee[capacity];
    }

    public void push(Employee employee)
    {
        if(top == stack.length)
        {
            //need to resize the backing array
            Employee[] newArray = new Employee[2* stack.length];
            System.arraycopy(stack, 0, newArray, 0, stack.length);
            stack = newArray;
        }
        stack[top++] = employee;
    }

    public Employee pop()
    {
        if(isEmpty())
            throw new EmptyStackException();

        Employee employee = stack[--top];
        //null it out
        stack[top] = null;

        return employee;
    }

    public Employee peek()
    {
        if(isEmpty())
            throw new EmptyStackException();

        return stack[top-1];
    }

    public int size()
    {
        return top;
    }

    public boolean isEmpty()
    {
        return top ==0;
    }
    public void printStack()
    {
        for(int i=top-1;i>=0;i--)
        {
            System.out.println(stack[i]);
        }
    }

}
