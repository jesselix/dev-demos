package li.jesse.javadevdatastructures.collection.set;

import li.jesse.javadevdatastructures.entity.Person;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

    Set hashSet = new HashSet();

    @Test
    public void testCheckInsert() {
        Set<Person> set = new HashSet<>();

        Person p1 = new Person("Andy", 1984);
        Person p2 = new Person("Andy", 1984);

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());

        set.add(p1);
        set.add(p2);
        System.out.println("size: " + set.size());
    }
}
