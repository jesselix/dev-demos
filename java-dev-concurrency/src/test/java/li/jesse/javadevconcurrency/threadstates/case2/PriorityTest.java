package li.jesse.javadevconcurrency.threadstates.case2;

public class PriorityTest {

    public static void main(String[] args) {
        Thread myThread = new MyThread1();
        for (int i = 0; i < 100; i++) {
            System.out.println("main thread i = " + i);
            if (i == 20) {
                myThread.setPriority(Thread.MAX_PRIORITY);
                myThread.start();
            }
        }
    }

    public static class MyThread1  extends Thread {
        public void run() {
            for (int i = 0; i < 100; i++) {
                System.out.println("i = " + i);
            }
        }
    }
}
