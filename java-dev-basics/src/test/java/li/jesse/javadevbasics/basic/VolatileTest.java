package li.jesse.javadevbasics.basic;

import java.util.concurrent.TimeUnit;

class MyData {

    volatile int number = 0;

    public void addData() {
        this.number = 50;
    }
}

public class VolatileTest {

    public static void main(String[] args) {
        MyData myData = new MyData();

        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " comes in");
            try {
                TimeUnit.SECONDS.sleep(3);
                myData.addData();
                System.out.println(Thread.currentThread().getName() + " updated");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "AAA"

        ).start();

        while (myData.number == 0) {

        }

        System.out.println(Thread.currentThread().getName() + " game over");
    }
}
