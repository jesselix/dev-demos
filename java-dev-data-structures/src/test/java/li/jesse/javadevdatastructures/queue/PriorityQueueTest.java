package li.jesse.javadevdatastructures.queue;

import li.jesse.javadevdatastructures.entity.Kid;
import org.junit.Test;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class PriorityQueueTest {

    //用于往队列增加数据的通用方法
    private static void addDataToQueue(Queue<Kid> kidPriorityQueue) {
        Random rand = new Random();
        for(int i=0; i<7; i++){
            int id = rand.nextInt(100);
            kidPriorityQueue.add(new Kid(id, "Pankaj "+id));
        }
    }

    //用于从队列取数据的通用方法
    private static void pollDataFromQueue(Queue<Kid> customerPriorityQueue) {
        while(true){
            Kid kid = customerPriorityQueue.poll();
            if(kid == null) break;
            System.out.println("Processing Customer with ID="+kid.getKidId());
        }
    }

    @Test
    public void testPriorityQueue() {
        Comparator<Kid> idComparator = new Comparator<Kid>() {
            @Override
            public int compare(Kid o1, Kid o2) {
//                if (o1.getKidId() < o2.getKidId()) {
//                    return 1;
//                } else {
//                    return -1;
//                }
                return (int) (o1.getKidId() - o2.getKidId());
            }
        };

        //优先队列自然排序示例
        Queue<Integer> integerPriorityQueue = new PriorityQueue<>(7);
        Random rand = new Random();
        for(int i=0;i<7;i++){
            integerPriorityQueue.add(new Integer(rand.nextInt(100)));
        }
        for(int i=0;i<7;i++){
            Integer in = integerPriorityQueue.poll();
            System.out.println("Processing Integer:"+in);
        }

        //优先队列使用示例
        Queue<Kid> customerPriorityQueue = new PriorityQueue<>(7, idComparator);
        addDataToQueue(customerPriorityQueue);

        pollDataFromQueue(customerPriorityQueue);
    }
}
