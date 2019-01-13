package li.jesse.javadevbasics.basic;

import org.junit.Test;

public class StringTest
{
    @Test
    public void testStringComparision()
    {
        int m = 3;
        int n = 3;

        System.out.print("m == n: ");
        System.out.println(m == n);
        System.out.println();

        String string  = new String("hello");
        String string1 = new String("hello");
        String string2 = new String("hello");

        System.out.print("string1 == string2: ");
        System.out.println(string1 == string2);

        System.out.print("string1 equals string2: ");
        System.out.println(string1.equals(string2));
        System.out.println();

        string1 = string;
        string2 = string;

        System.out.print("string1 == string2: ");
        System.out.println(string1 == string2);

        System.out.print("string1 equals string2: ");
        System.out.println(string1.equals(string2));

    }

    @Test
    public void testStringComparision2()
    {
        String a = "abc";
        String b = "abc";
        String c = new String("abc");
        String d = "ab" + "c";

        System.out.println(a == b); // true
        System.out.println(a == c); // false
        System.out.println(a == d); // true
        System.out.println(c == d); // false
    }

    @Test
    public void testStringPool() {
        String s1 = new String("A");
        System.out.println(s1 == s1.intern()); // false

        String s2 = new String("A") + new String("B");
        System.out.println(s2 == s2.intern()); // true

        String ss2 = "AB";
        String ss1 = new String("A") + new String("B");
        System.out.println(ss1 == ss1.intern()); // false
    }

    @Test
    public void testGo() {
        String a1 = "abc";
        String a2 = "abc";

        System.out.println(a1.hashCode());
        System.out.println(a2.hashCode());
    }
}
