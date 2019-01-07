package li.jesse.javadevconcurrency.threadstates.case2;

public class SleepTest {

    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);

        for(int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            if (i == 30) {
                thread.start();
                try {
                    Thread.sleep(1);   // 使得thread必然能够马上得以执行
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

