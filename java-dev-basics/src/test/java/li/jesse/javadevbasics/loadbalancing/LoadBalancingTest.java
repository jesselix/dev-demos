package li.jesse.javadevbasics.loadbalancing;

import li.jesse.javadevbasics.loadbalancing.IpMap;
import li.jesse.javadevbasics.loadbalancing.Randomm;
import li.jesse.javadevbasics.loadbalancing.RoundRobin;
import li.jesse.javadevbasics.loadbalancing.WeightRandom;
import org.junit.Test;

public class LoadBalancingTest {

    @Test
    public void testRoundRobin() {
        RoundRobin robin = new RoundRobin();
        for (int i = 0; i < IpMap.serverWeightMap.size(); i++) {
            String serverIp = robin.getServer();
            System.out.println(serverIp);
        }
    }

    @Test
    public void testRandomm() {
        String serverIp = Randomm.getServer();
        System.out.println(serverIp);
    }

    @Test
    public void testWeightRoundRobin() {
//        for (int i = 0; i < IpMap.serverWeightMap.size(); i++) {
//            String serverIp = WeightRoundRobin.getServer();
//            System.out.println(serverIp);
//        }
    }

    @Test
    public void testWeightRandom() {
        String serverIp = WeightRandom.getServer();
        System.out.println(serverIp);
    }

    @Test
    public void testIpHash() {
//        String serverIp = IpHash.getServer("192.168.1.100");
//        System.out.println(serverIp);
    }
}
