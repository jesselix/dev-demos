package li.jesse.basic;

import li.jesse.enumeration.CommonEnum;
import org.junit.Test;

public class EnumTest {

    public enum Fruit {
        APPLE,
        ORANGE
    }

    public void testEnum(CommonEnum.Color color) {
        if (CommonEnum.Color.BLUE.equals(color)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    public void testEnum2(Fruit fruit) {
        if (Fruit.APPLE.equals(fruit)) {
            System.out.println("111");
        } else {
            System.out.println("222");
        }
    }

    @Test
    public void testEnum() {
        testEnum(CommonEnum.Color.BLUE);
        testEnum(CommonEnum.Color.RED);
        testEnum2(Fruit.ORANGE);
    }
}
