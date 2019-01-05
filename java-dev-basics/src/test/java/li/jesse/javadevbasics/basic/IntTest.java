package li.jesse.javadevbasics.basic;

import org.junit.Test;

public class IntTest {

    @Test
    public void testOddOrEven() {

        int x = 5;

        if (x % 2 == 1) {
            System.out.println("1: odd");
        }

        if (x % 2 != 0) {
            System.out.println("2: odd");
        }

        // recommended
        int a = x & 1;
        if (a != 0) {
            System.out.println("3: odd");
        }
    }
}
