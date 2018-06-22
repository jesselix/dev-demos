package li.jesse.data.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

    Set hashSet = new HashSet();

    public void hashSetAddElements() {
        for (int i = 0; i < 10; i++) {
            hashSet.add(i);
        }
    }

    public static void iteratorHashSet(HashSet set) {
        for(Iterator iterator = set.iterator();
            iterator.hasNext(); ) {
            System.out.printf("iterator : %s\n", iterator.next());
        }
    }

}
