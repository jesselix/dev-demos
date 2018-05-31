package li.jesse.basic;

import li.jesse.entity.Box;
import org.junit.Test;

public class GenericsTest {

    public static <E> void printArray(E[] inputArray) {

        for (E element : inputArray) {
            System.out.printf("%s ", element);
        }
    }

    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;
        if ( y.compareTo( max ) > 0 ){
            max = y;
        }
        if ( z.compareTo( max ) > 0 ){
            max = z;
        }
        return max;
    }

    @Test
    public void testPrintArray() {
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

        printArray( intArray);
        System.out.println();
        printArray( doubleArray);
        System.out.println();
        printArray( charArray);
        System.out.println();
    }

    @Test
    public void testMaximum() {
        System.out.println(maximum(3, 4, 5));
        System.out.println(maximum(5.1, 4.1, 3.1));
        System.out.println(maximum("apple", "orange", "banana"));
    }

    @Test
    public void testGenericsClass() {
        Box<Integer> integerBox = new Box<Integer>();
        Box<String> stringBox = new Box<String>();

        integerBox.setT(10);
        stringBox.setT("好啊");

        System.out.println(integerBox.getT());
        System.out.println(stringBox.getT());
    }

}
