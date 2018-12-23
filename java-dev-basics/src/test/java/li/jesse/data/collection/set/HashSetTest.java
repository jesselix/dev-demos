package li.jesse.data.collection.set;

import li.jesse.entity.Person;
import org.junit.Test;

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

    @Test
    public void testCheckHashCode() {
        Set<Person> set = new HashSet<>();

        Person p1 = new Person("Andy", 1983);
        Person p2 = new Person("Andy", 1983);

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());

        set.add(p1);
        set.add(p2);
        System.out.println("size: " + set.size());
    }


}
