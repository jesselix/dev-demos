package li.jesse.data.collection.list;

import org.junit.Test;

import java.util.Vector;

public class VectorTest {

    Vector vector = new Vector();

    public void vectorAddElements() {
        vector.add("0");
        vector.add("1");
        vector.add("2");
        vector.add("3");
        vector.add("4");
    }

    @Test
    public void testSetVectorElement() {
        vectorAddElements();
        vector.set(0, "100");

        System.out.println("vector indexOf(100):" + vector.indexOf("100"));
    }
}
