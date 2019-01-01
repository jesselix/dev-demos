package li.jesse.javadevdatastructures.collection.list;

import org.junit.Test;

import java.util.Vector;

public class VectorTest {

    private Vector vector1 = new Vector();

    @Test
    public void testVector() {
        vector1.add("1");
        vector1.add("2");
        vector1.add("3");
        vector1.add("4");
        vector1.add("5");

        System.out.println(vector1);

        vector1.set(0, "100");
        vector1.set(2, "100");

        System.out.println(vector1);

        System.out.println(vector1.indexOf("100"));
        System.out.println(vector1.lastIndexOf("100"));

    }
}
