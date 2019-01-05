package li.jesse.javadevdatastructures.collection.set;

import li.jesse.javadevbasics.entity.Person;
import org.junit.Test;

import java.util.LinkedHashSet;

public class LinkedHashSetTest {

    LinkedHashSet linkedHashSet = new LinkedHashSet();


    @Test
    public void testCheckInsert() {
        Person p1 = new Person("Andy", 1984);
        Person p2 = new Person("Andy", 1984);

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());

        linkedHashSet.add(p1);
        linkedHashSet.add(p2);
        System.out.println("size: " + linkedHashSet.size());
    }
}
