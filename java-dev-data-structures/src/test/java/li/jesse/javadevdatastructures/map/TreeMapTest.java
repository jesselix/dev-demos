package li.jesse.javadevdatastructures.map;

import org.junit.Test;

import java.util.TreeMap;

public class TreeMapTest {

    private TreeMap treeMap1 = new TreeMap();
    private TreeMap treeMap2 = new TreeMap();

    @Test
    public void testTreeMap() {
        treeMap1.put("one", 1);
        treeMap1.put("two", 2);
        treeMap1.put("three", 3);

        System.out.println(treeMap1);
        System.out.println(treeMap1.size());
    }

    @Test
    public void testNav() {
        treeMap2.put("aaa", 111);
        treeMap2.put("bbb", 222);
        treeMap2.put("ccc", 333);
        treeMap2.put("ddd", 444);
        treeMap2.put("eee", 555);

        System.out.println(treeMap2.firstEntry());
        System.out.println(treeMap2.lowerKey("ccc"));
    }
}
