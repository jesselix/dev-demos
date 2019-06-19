package li.jesse.javadevintegration.util;

import org.junit.Test;

public class SnowflakeIdWorkerTest {

    @Test
    public void testSnowFlakeIdWorker() {
        SnowflakeIdWorker idWorker = new SnowflakeIdWorker(0, 0);
        for (int i = 0; i < 10; i++) {
            long id = idWorker.nextId();
            System.out.println(Long.toBinaryString(id));
            System.out.println(id);
            System.out.println();
        }
    }
}
