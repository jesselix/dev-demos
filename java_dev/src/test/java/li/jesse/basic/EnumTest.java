package li.jesse.basic;

import li.jesse.enums.SomeEnum;
import org.junit.Test;

public class EnumTest {

    public enum Fruit {
        APPLE,
        ORANGE
    }

    public void testGo(SomeEnum.Color color) {
        if (SomeEnum.Color.BLUE.equals(color)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    public void testGo2(Fruit fruit) {
        if (Fruit.APPLE.equals(fruit)) {
            System.out.println("111");
        } else {
            System.out.println(222);
        }
    }

    @Test
    public void testEnum() {
        testGo(SomeEnum.Color.BLUE);
        testGo(SomeEnum.Color.RED);
        testGo2(Fruit.APPLE);
    }
}
