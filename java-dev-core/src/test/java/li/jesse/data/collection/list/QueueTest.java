package li.jesse.data.collection.list;

import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

    @Test
    public void testQueue() {
        Queue<String> queue = new LinkedList<>();
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");

        for (String q : queue) {
            System.out.print(q + " ");
        }

        queue.poll();
        System.out.println();

        for (String q : queue) {
            System.out.print(q + " ");
        }

        System.out.println();
        System.out.println(queue.peek());
        System.out.println(queue.element());
    }

}
