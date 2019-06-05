package li.jesse.javadevbasics.error;

import java.util.Random;

public class OomJavaHeapSpaceTest {

    public static void main(String[] args) {
        String str = "test test test";

        while (true) {
            str += str + new Random().nextInt(1111111);
            str.intern();
        }
    }
}
