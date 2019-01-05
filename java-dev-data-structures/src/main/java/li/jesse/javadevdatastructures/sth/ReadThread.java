package li.jesse.javadevdatastructures.sth;

import java.util.List;

public class ReadThread implements Runnable {

    private List<Integer> list;

    public ReadThread(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        for (Integer element : list) {
            System.out.println("Read Thread: " + element);
        }
    }
}
