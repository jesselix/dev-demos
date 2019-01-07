package li.jesse.javadevconcurrency.threadstates.case2;

public class JoinTest {

    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            if (i == 30) {
                thread.start();
                try {
                    thread.join();    // main线程需要等待thread线程执行完后才能继续执行
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
