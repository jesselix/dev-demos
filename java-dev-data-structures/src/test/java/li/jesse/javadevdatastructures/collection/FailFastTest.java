package li.jesse.javadevdatastructures.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastTest {

    private static List<String> list = new ArrayList<>();

    private static void printAll() {
        String value = null;
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            value = (String)iterator.next();
            System.out.print(value + ", ");
        }
    }

    public static void main(String[] args) {
        new ThreadOne().start();
        new ThreadTwo().start();
    }

    private static class ThreadOne extends Thread {
        public void run() {
            int i = 0;
            while (i < 6) {
                list.add(String.valueOf(i));
                printAll();
                i++;
            }
        }
    }

    private static class ThreadTwo extends Thread {
        public void run() {
            int i = 10;
            while (i < 16) {
                list.add(String.valueOf(i));
                printAll();
                i++;
            }
        }
    }
}
