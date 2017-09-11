package li.jesse.data;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest
{
    @Test
    public void testGetFirstAndLastElement()
    {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("3");
        linkedList.add("4");
        linkedList.add("5");

        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
    }

    @Test
    public void testAddElement()
    {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("3");
        linkedList.add("4");
        linkedList.add("5");

        linkedList.addFirst("x");
        linkedList.addFirst("y");

        System.out.println(linkedList);
    }

//    @Test
//    public void testLinkedListAsStack()
//    {
//        LinkedListAsStack stack = new LinkedListAsStack();
//
//        for (int i = 0; i < 10; i++)
//        {
//            stack.push(i);
//        }
//
//        stack.printFromTopToBottom();
//        System.out.println();
//
//        stack.pop();
//        stack.pop();
//
//        stack.printFromTopToBottom();
//    }

//    @Test
//    public void testLinkedListAsQueue()
//    {
//        LinkedListAsQueue queue = new LinkedListAsQueue();
//
//        for (int i = 0; i < 10; i++)
//        {
//            queue.put(i);
//        }
//
//        queue.print();
//        System.out.println();
//
//        queue.get();
//        queue.get();
//
//        queue.print();
//    }
}
