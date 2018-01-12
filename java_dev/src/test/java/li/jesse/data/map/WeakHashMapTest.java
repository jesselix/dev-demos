package li.jesse.data.map;

import org.junit.Test;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapTest {

    @Test
    public void weakHashMapInitAndAddElements() {
        Map weakHashMap = new WeakHashMap();
        // init weak keys
        String w1 = new String("one");
        String w2 = new String("two");
        String w3 = new String("three");

        weakHashMap.put(w1, "w1");
        weakHashMap.put(w2, "w2");
        weakHashMap.put(w3, "w3");

        System.out.printf("%s\n", weakHashMap);

        System.out.printf("contains key two : %s\n", weakHashMap.containsKey("two"));
        System.out.printf("contains key five : %s\n", weakHashMap.containsKey("five"));

        System.out.printf("contains value 0 : %s\n", weakHashMap.containsValue(new Integer(0)));
    }

}
