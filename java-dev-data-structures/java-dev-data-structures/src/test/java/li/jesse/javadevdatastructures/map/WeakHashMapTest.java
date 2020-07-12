package li.jesse.javadevdatastructures.map;

import org.junit.Test;

import java.util.WeakHashMap;

public class WeakHashMapTest {

    private WeakHashMap weakHashMap1 = new WeakHashMap();

    @Test
    public void testWeakHashMapTest() {

        String one = new String("one");

        weakHashMap1.put(one, "w1");
        weakHashMap1.put("two", "w2");
        weakHashMap1.put("three", "w3");

        System.out.println(weakHashMap1);
        System.out.println(weakHashMap1.size());

        one = null;
        System.gc();

        System.out.println(weakHashMap1);
        System.out.println(weakHashMap1.size());
    }
}
