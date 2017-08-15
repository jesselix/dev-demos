package li.jesse.basic;

import org.junit.Test;

public class StringTest
{
    @Test
    public void testStringComparision()
    {
        String string  = new String("hello");
        String string1 = new String("hello");
        String string2 = new String("hello");

        System.out.println(string1 == string2);
        System.out.println(string1.equals(string2));

        string1 = string;
        string2 = string;

        System.out.println(string1 == string2);
//        System.out.println(string1.equals(string2));
    }
}
