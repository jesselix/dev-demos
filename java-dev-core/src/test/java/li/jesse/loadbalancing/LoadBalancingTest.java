package li.jesse.loadbalancing;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LoadBalancingTest {

    @Test
    public void testRoundRobin() {
        RoundRobin robin = new RoundRobin();
        for (int i = 0; i < 20; i++) {
            String serverIp = robin.roundRobin();
            System.out.println(serverIp);
        }
    }

    @Test
    public void testRandomm() {
        String serverIp = Randomm.randomm();
        System.out.println(serverIp);
    }

}
