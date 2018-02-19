package li.jesse.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TicketSellingRunnable implements Runnable {

    private int ticketCount = 100;
    private Object mutex = new Object();
//    private Lock lock = new ReentrantLock();

    public void sellTicket() {
        synchronized (mutex) {
            if (ticketCount > 0) {
                ticketCount--;
                System.out.println(Thread.currentThread().getName()
                        + "正在卖票,还剩" + ticketCount + "张票");
            }
            else {
                System.out.println("票已经卖完！");
                return;
            }
        }
    }

//    public void sellTicket2() {
//        lock.lock();
//            if (ticketCount > 0) {
//                ticketCount--;
//                System.out.println(Thread.currentThread().getName()
//                        + "正在卖票,还剩" + ticketCount + "张票");
//            }
//            else {
//                System.out.println("票已经卖完！");
//                return;
//            }
//        lock.unlock();
//    }

    @Override
    public void run() {
        while (ticketCount > 0) {
            sellTicket();

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] arg) {
        TicketSellingRunnable myRunnable = new TicketSellingRunnable();
        Thread t1 = new Thread(myRunnable, "窗口1");
        Thread t2 = new Thread(myRunnable, "窗口2");
        Thread t3 = new Thread(myRunnable, "窗口3");
        t1.start();
        t2.start();
        t3.start();
    }
}
