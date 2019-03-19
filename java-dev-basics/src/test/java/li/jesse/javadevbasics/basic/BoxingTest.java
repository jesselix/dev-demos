package li.jesse.javadevbasics.basic;

import org.junit.Test;

public class BoxingTest {

    @Test
    public void testIntegerBoxing() {
        Integer i1 = 10;
        Integer i2 = 10;
        Integer i3 = 150;
        Integer i4 = 150;
        Integer i5 = 127;
        Integer i6 = 127;
        Integer i7 = -5;
        Integer i8 = -5;
        Integer i9 = -129;
        Integer i10 = -129;
        System.out.println(i1 == i2);  // true
        System.out.println(i3 == i4);  // false
        System.out.println(i5 == i6);  // true
        System.out.println(i7 == i8);  // true
        System.out.println(i9 == i10); // false
    }

    @Test
    public void testDoubleBoxing() {
        Double d1 = 100.0;
        Double d2 = 100.0;
        Double d3 = 200.0;
        Double d4 = 200.0;
        System.out.println(d1 == d2);
        System.out.println(d3 == d4);
    }
}
