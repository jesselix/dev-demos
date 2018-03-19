package li.jesse.data.map;

import org.junit.Test;

import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class TreeMapTest {

    TreeMap treeMap = new TreeMap();

    @Test
    public void testTreeMap01() {
        Random random = new Random();
        treeMap.put("one", random.nextInt(10));
        treeMap.put("two", random.nextInt(10));
        treeMap.put("three", random.nextInt(10));

        System.out.println(treeMap);

        Iterator iterator = treeMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println("size: " + treeMap.size());

        System.out.println("contains key two : " + treeMap.containsKey("two"));
        System.out.println("contains key two : " + treeMap.containsKey("five"));

        System.out.println("contains value 0 : " + treeMap.containsValue(0));

        treeMap.remove("three");

        System.out.println(treeMap);

        treeMap.clear();

        System.out.println(treeMap.isEmpty() ? "treeMap is empty" : "treeMap is not empty");

        System.out.println(treeMap);
    }

    @Test
    public void testSubMap() {
        treeMap.put("a", 101);
        treeMap.put("b", 102);
        treeMap.put("c", 103);
        treeMap.put("d", 104);
        treeMap.put("e", 105);

        System.out.println(treeMap);


    }
}
