package li.jesse.javadevbasics.basic;

import org.junit.Test;

import java.util.Random;

public class RandomTest {

    @Test
    public void testSystemTimeMillis() {
        long l = System.currentTimeMillis();
        int i = (int)(l % 100);

        System.out.println(l);
        System.out.println(i);
    }

    @Test
    public void testMathRandom() {
        double d = Math.random();
        int i = (int)(d * 100);

        System.out.println(d);
        System.out.println(i);
    }

    public static void testRandomAPIs(Random random, String title) {
        final int BUFFER_LEN = 5;

        // 获取随机的boolean值
        boolean b = random.nextBoolean();
        // 获取随机的数组buf[]
        byte[] buf = new byte[BUFFER_LEN];
        random.nextBytes(buf);
        // 获取随机的Double值，范围[0.0, 1.0)
        double d = random.nextDouble();
        // 获取随机的float值，范围[0.0, 1.0)
        float f = random.nextFloat();
        // 获取随机的int值
        int i1 = random.nextInt();
        // 获取随机的[0,100)之间的int值
        int i2 = random.nextInt(100);
        // 获取随机的高斯分布的double值
        double g = random.nextGaussian();
        // 获取随机的long值
        long l = random.nextLong();

        System.out.printf("\n---- %s ----\nb=%s, d=%s, f=%s, i1=%s, i2=%s, g=%s, l=%s, buf=[",
                title, b, d, f, i1, i2, g, l);
        for (byte bt:buf)
            System.out.printf("%s, ", bt);
        System.out.println("]");
    }

    public static void main(String[] args) {
        testRandomAPIs(new Random(1000), " 1st Random(1000)");
    }
}
