package li.jesse.javadevdatastructures.collection.set;

import li.jesse.javadevdatastructures.entity.Student;
import org.junit.Test;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

    TreeSet treeSet = new TreeSet();

    @Test
    public void iteratorHashSet() {

        for (int i = 0; i < 10; i++) {
            treeSet.add(i);
        }

        for(Iterator iterator = treeSet.iterator();
            iterator.hasNext(); ) {
            System.out.printf("iterator : %s\n", iterator.next());
        }
    }

    @Test
    public void test01() {
        TreeSet<Student> treeSet = new TreeSet<>();
        Student s1 = new Student("johnson", 45);
        Student s2 = new Student("andy", 35);
        Student s3 = new Student("kenny", 49);
        Student s4 = new Student("deli", 36);

        treeSet.add(s1);
        treeSet.add(s2);
        treeSet.add(s3);
        treeSet.add(s4);

        for (Student student01 : treeSet) {
            System.out.println(student01.getName() + " -- " + student01.getAge());
        }
    }

}
