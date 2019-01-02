package li.jesse.javadevdatastructures.map;

import org.junit.Test;

import java.util.TreeMap;

public class TreeMapTest {

    private TreeMap treeMap1 = new TreeMap();

    @Test
    public void testTreeMap() {
        treeMap1.put("one", 1);
        treeMap1.put("two", 2);
        treeMap1.put("three", 3);

        System.out.println(treeMap1);
        System.out.println(treeMap1.size());
    }
}
