package li.jesse.javadevconcurrency.threadstates.case3;

public class JoinTest {

    static Thread t1 = new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println("I am t1");
        }
    });

    static Thread t2 = new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println("I am t2");
        }
    });

    static Thread t3 = new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println("I am t3");
        }
    });

    public static void main(String[] args) throws InterruptedException {
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
    }
}
