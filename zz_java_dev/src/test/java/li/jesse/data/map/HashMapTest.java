package li.jesse.data.map;

import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public class HashMapTest {

    HashMap hashMap = new HashMap();

    @Test
    public void testHashMap01() {
        Random random = new Random();
        hashMap.put("one", random.nextInt(10));
        hashMap.put("two", random.nextInt(10));
        hashMap.put("three", random.nextInt(10));

        System.out.println(hashMap);

        Iterator iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println(hashMap.size());

        System.out.println("contains key two : " + hashMap.containsKey("two"));

        hashMap.remove("three");

        System.out.println(hashMap);

        hashMap.clear();

        System.out.println(hashMap.isEmpty() ? "hashMap is empty" : "hashMap is not empty");

        System.out.println(hashMap);
    }

}
