package li.jesse.javadevbasics.type;

import org.junit.Test;

public class StringTest {

    String str1 = "abc";
    String str2 = "abc";
    String str3 = new String("abc");
    String str4 = new String("abc");

    @Test
    public void testStringPool() {
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
        System.out.println(System.identityHashCode(str3));
        System.out.println(System.identityHashCode(str4));

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str3 == str4);
    }

    @Test
    public void testStringComparison() {
        System.out.println(str1.equals(str3));
        System.out.println(str2.compareTo(str1));
    }
}
