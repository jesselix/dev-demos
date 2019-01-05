package li.jesse.javadevdatastructures.map;

import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapTest {

    HashMap hashMap = new HashMap();

    @Test
    public void testHashMap() {


        System.out.println(hashMap);

        Iterator iter = hashMap.entrySet().iterator();
        while(iter.hasNext()) {
            Map.Entry entry = (Map.Entry)iter.next();
            System.out.println("next : "+ entry.getKey() +" - "+entry.getValue());
        }

        System.out.println(hashMap.size());

        System.out.println("contains key two : " + hashMap.containsKey("two"));
        System.out.println("contains key two : " + hashMap.containsKey("five"));

        hashMap.clear();
        System.out.println("is empty: " + hashMap.isEmpty());
    }

    @Test
    public void testSet() {
        hashMap.put("one", 10);
        hashMap.put("two", 20);
        hashMap.put("three", 30);

        System.out.println(hashMap.keySet());
        System.out.println(hashMap.entrySet());

        Iterator iterator = hashMap.values().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
