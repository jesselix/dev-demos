package li.jesse.data.collection.set;

import li.jesse.entity.Student01;
import li.jesse.entity.Student02;
import li.jesse.function.MyComparerDemo;
import org.junit.Test;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

    TreeSet treeSet = new TreeSet();

    public void treeSetAddElements() {
        for (int i = 0; i < 10; i++) {
            treeSet.add(i);
        }
    }

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
        TreeSet<Student01> treeSet = new TreeSet<>();
        Student01 s1 = new Student01("johnson", 45);
        Student01 s2 = new Student01("andy", 35);
        Student01 s3 = new Student01("kenny", 44);
        Student01 s4 = new Student01("deli", 36);

        treeSet.add(s1);
        treeSet.add(s2);
        treeSet.add(s3);
        treeSet.add(s4);

        for (Student01 student01 : treeSet) {
            System.out.println(student01.getName() + " -- " + student01.getAge());
        }
    }

    @Test
    public void test02() {
        TreeSet<Student02> ts=new TreeSet<Student02>(new MyComparerDemo());
        Student02 s=new Student02("linqingxia",27);
        Student02 s1=new Student02("zhangguorong",29);
        Student02 s2=new Student02("wanglihong",23);
        Student02 s3=new Student02("liushishi",22);
        Student02 s4=new Student02("wuqilong",40);
        Student02 s5=new Student02("fengqingy",22);
        Student02 s6=new Student02("linqingxia",29);

        ts.add(s);
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);
        for(Student02 ss:ts){
            System.out.println(ss.getName()+"---"+ss.getAge());
        }
    }

}
