package li.jesse.basic;

import org.junit.Test;

public class EqualTest {

    @Test
    public void testEqual() {

        int a1 = 3;
        int a2 = 4;
        int a3 = 3;

        String s1 = "hello";
        String s2 = "hello";

        Object o1 = null;
        Object o2 = null;

        if (a1 == a3) {
            System.out.println("ddd");
        }

        if (s1 == s2) {
            System.out.println("fff");
        }

        if (o1 == o2) {
            System.out.println("ccc");
        }
    }
}
