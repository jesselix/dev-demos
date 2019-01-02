package li.jesse.javadevdatastructures.map;

import org.junit.Test;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashtableTest {

    Hashtable hashtable = new Hashtable();

    @Test
    public void testHashtable() {
        hashtable.put("one", 10);
        hashtable.put("two", 20);
        hashtable.put("three", 30);

        System.out.println(hashtable);

        Iterator iter = hashtable.entrySet().iterator();
        while(iter.hasNext()) {
            Map.Entry entry = (Map.Entry)iter.next();
            System.out.println("next : " + entry.getKey() + " - " + entry.getValue());
        }

        System.out.println(hashtable.size());

        System.out.println("contains key two : " + hashtable.containsKey("two"));
    }
}
