package li.jesse.javadevconcurrency.thread;

public class WaitSleepTest {

    public static void main(String[] args) {
        final Object lock = new Object();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread A is waiting");
                synchronized (lock) {
                    System.out.println("thread A get lock");
                    try {
                        Thread.sleep(20);
                        System.out.println("thread A get wait method");
                        lock.wait();
                        System.out.println("thread A is done");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        }).start();
    }
}
