package li.jesse.javadevbasics.basic;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalTest {

    @Test
    public void testBigDecimal() {
        double num1 = 0.02;
        double num2 = 0.03;

        double num3 = num2 - num1;
        System.out.println(num3);

        BigDecimal num4 = new BigDecimal(0.05);
        BigDecimal num5 = new BigDecimal(0.06);

        System.out.println(num5.subtract(num4).setScale(2, RoundingMode.HALF_UP));
    }
}
