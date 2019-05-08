package li.jesse.javadevbasics.type;

import org.junit.Test;

public class IntegerTest {

    @Test
    public void testInteger() {
        Integer a1 = new Integer(100);
        Integer a2 = new Integer(100);
        System.out.println(a1 == a2);

        Integer b1 = 101;
        Integer b2 = 101;
        System.out.println(b1 == b2);

        Integer c1 = 128;
        Integer c2 = 128;
        System.out.println(c1 == c2);
    }
}
