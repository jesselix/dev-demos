package li.jesse.javadevdatastructures.collection.list;

import org.junit.Test;

import java.util.LinkedList;

public class LinkedListTest {

    private LinkedList linkedList1 = new LinkedList();

    @Test
    public void testLinkedList() {
        linkedList1.add("1");
        linkedList1.add("2");
        linkedList1.add("3");

        System.out.println(linkedList1);

        linkedList1.add(1, "555");

        System.out.println(linkedList1);
    }
}
