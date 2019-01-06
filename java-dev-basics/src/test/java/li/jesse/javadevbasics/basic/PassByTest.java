package li.jesse.javadevbasics.basic;

import li.jesse.javadevbasics.entity.Student;
import org.junit.Test;

public class PassByTest {

    Student a = new Student("zhangsan", 20);
    Student b = new Student("lisi", 22);

    @Test
    public void testPassBy() {
        swap(a, b);

        System.out.println(a.getName() + " " + a.getAge());
        System.out.println(b.getName() + " " + b.getAge());
    }

    public static void swap(Student x, Student y) {
        Student temp = x;
        x = y;
        y = temp;
    }
}
