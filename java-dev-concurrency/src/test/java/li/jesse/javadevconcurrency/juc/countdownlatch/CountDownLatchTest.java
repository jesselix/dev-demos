package li.jesse.javadevconcurrency.juc.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest {

//    public static void main(String[] args) {
//        for (int i = 0; i < 6; i++) {
//            new Thread(() -> {
//                System.out.println(Thread.currentThread().getName());
//            }, String.valueOf(i)).start();
//        }
//
//        System.out.println(Thread.currentThread().getName() + " lalala");
//    }



    public static void main(String[] args) throws InterruptedException {

        CountDownLatch countDownLatch = new CountDownLatch(6);

        for (int i = 0; i < 6; i++) {
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName());
                countDownLatch.countDown();
            }, String.valueOf(i)).start();
        }

        countDownLatch.await();
        System.out.println(Thread.currentThread().getName() + " lalala");
    }
}
