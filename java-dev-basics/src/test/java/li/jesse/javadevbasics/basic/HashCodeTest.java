package li.jesse.javadevbasics.basic;

import org.junit.Test;

public class HashCodeTest {

    @Test
    public void testHashCode() {
        String str1 = "abc";
        String str2 = "abc";
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

        System.out.println(str1.equals(str2));
    }
}
