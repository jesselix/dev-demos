package li.jesse.data.collection.list;

import java.util.Stack;

public class StackTest {

    public void stackAddElements() {
        Stack stack = new Stack();

        for (int i = 0; i < 5; i++) {
            stack.push(String.valueOf(i));
        }


    }
}
