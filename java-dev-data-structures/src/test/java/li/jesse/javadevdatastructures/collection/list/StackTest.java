package li.jesse.javadevdatastructures.collection.list;

import org.junit.Test;

import java.util.List;
import java.util.Stack;

public class StackTest {

    private Stack stack1 = new Stack();

    @Test
    public void testStack() {
        stack1.push("1");
        stack1.push("2");
        stack1.push("3");
        stack1.push("4");
        stack1.push("5");

        iteratorThroughRandomAccess(stack1);
    }

    public static void iteratorThroughRandomAccess(List list) {
        String val = null;
        for (int i = 0; i < list.size(); i++) {
            val = (String)list.get(i);
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
