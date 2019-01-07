package li.jesse.javadevconcurrency.threadstates.case2;

public class DaemonTest {

    public static void main(String[] args) {
        Thread myThread = new MyThread();
        for (int i = 0; i < 100; i++) {
            System.out.println("main thread i = " + i);
            if (i == 20) {
                myThread.setDaemon(true);   //设置为后台守护线程
                myThread.start();
            }
        }
    }

    public static class MyThread extends Thread {

        public void run() {
            for (int i = 0; i < 100; i++) {
                System.out.println("i = " + i);
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
