package li.jesse.basic;

import li.jesse.enumeration.CommonEnum;
import org.junit.Test;

public class EnumTest {

    public void testEnum(CommonEnum.Color color) {
        if (CommonEnum.Color.RED.equals(color)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    @Test
    public void testEnum() {
        testEnum(CommonEnum.Color.RED);
        testEnum(CommonEnum.Color.GREEN);
    }
}
