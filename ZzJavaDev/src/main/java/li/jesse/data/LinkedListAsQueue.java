package li.jesse.data;

import java.util.LinkedList;

public class LinkedListAsQueue
{
    private LinkedList linkedList = new LinkedList();

    public void put(Object o)
    {
        linkedList.addFirst(o);
    }

    public Object get()
    {
        return linkedList.removeLast();
    }

    public boolean isEmpty()
    {
        return linkedList.isEmpty();
    }

    public void print()
    {
        for (Object o : linkedList)
        {
            System.out.print(o);
            System.out.print(" ");
        }
    }
}
