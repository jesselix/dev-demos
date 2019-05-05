package li.jesse.javadevbasics.basic;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EqualTest {

    @Test
    public void testEqual() {

        int a1 = 3;
        int a2 = 4;
        int a3 = 3;

        String s1 = "hello";
        String s2 = "hello";

        Object o1 = null;
        Object o2 = null;

        Date date1 = new Date();
        Date date2 = new Date();

//        if (a1 == a3) {
//            System.out.println("ddd");
//        }
//
//        if (s1 == s2) {
//            System.out.println("fff");
//        }
//
//        if (date1 == date2) {
//            System.out.println("ccc");
//        } else {
//            System.out.println("bbb");
//        }

        if (s1.equals(s2)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }
}
