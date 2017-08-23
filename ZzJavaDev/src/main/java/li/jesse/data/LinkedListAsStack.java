package li.jesse.data;

import java.util.LinkedList;

public class LinkedListAsStack
{
    private LinkedList linkedList = new LinkedList();

    public void push(Object o)
    {
        linkedList.addFirst(o);
    }

    public void pop()
    {
        linkedList.removeFirst();
    }

    public Object top()
    {
        return linkedList.getFirst();
    }

    public void printFromTopToBottom()
    {
        for (Object o : linkedList)
        {
            System.out.print(o);
            System.out.print(" ");
        }
    }
}
