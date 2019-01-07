package li.jesse.javadevbasics.basic;

import li.jesse.javadevbasics.entity.Student;
import org.junit.Test;

public class PassByTest {

    Student a = new Student("zhangsan", 20);
    Student b = new Student("lisi", 22);

    int aa = 3;
    int bb = 4;

    @Test
    public void testPassBy() {
        swap(a, b);

        System.out.println(a.getName() + " " + a.getAge());
        System.out.println(b.getName() + " " + b.getAge());
    }

    @Test
    public void testPassBy2() {
        swap2(aa, bb);

        System.out.println(aa);
        System.out.println(bb);
    }

    @Test
    public void testPassBy3() {
        int aaa = 3;
        int bbb = 4;

        int temp = aaa;
        aaa = bbb;
        bbb = temp;

        System.out.println(aaa);
        System.out.println(bbb);
    }

    public static void swap(Student x, Student y) {
        Student temp = x;
        x = y;
        y = temp;
    }

    public static void swap2(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
    }
}
