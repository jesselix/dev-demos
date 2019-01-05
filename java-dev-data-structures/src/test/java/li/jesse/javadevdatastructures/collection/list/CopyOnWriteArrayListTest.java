package li.jesse.javadevdatastructures.collection.list;

import li.jesse.javadevdatastructures.sth.ReadThread;
import li.jesse.javadevdatastructures.sth.WriteThread;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CopyOnWriteArrayListTest {

    public void goCopyOnWriteArrayList() throws InterruptedException {
        List<Integer> tempList = Arrays.asList(new Integer[] {1, 2});
        CopyOnWriteArrayList<Integer> copyList = new CopyOnWriteArrayList<>(tempList);

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.execute(new ReadThread(copyList));
        executorService.execute(new WriteThread(copyList));
        executorService.execute(new WriteThread(copyList));
        executorService.execute(new WriteThread(copyList));
        executorService.execute(new ReadThread(copyList));
        executorService.execute(new WriteThread(copyList));
        executorService.execute(new ReadThread(copyList));
        executorService.execute(new WriteThread(copyList));

        Thread.sleep(2000);
        System.out.println("copyList size: " + copyList.size());
        System.out.println(copyList);
    }

    public static void main(String[] args) throws InterruptedException {
        new CopyOnWriteArrayListTest().goCopyOnWriteArrayList();
    }
}
