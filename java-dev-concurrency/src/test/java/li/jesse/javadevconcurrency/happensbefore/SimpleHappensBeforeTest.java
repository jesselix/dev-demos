package li.jesse.javadevconcurrency.happensbefore;

public class SimpleHappensBeforeTest {

//    private static volatile int a = 0;
//    private static volatile boolean flag = false;
//    private static int count = 0;
//
//    public static void main(String[] args) throws InterruptedException {
//        for (int i = 0; i < 100; i++) {
//            ThreadA threadA = new ThreadA();
//            ThreadB threadB = new ThreadB();
//            threadA.start();
//            threadB.start();
//
//            threadA.join();
//            threadB.join();
//            a = 0;
//            flag = false;
//        }
//        System.out.println(count);
//    }
//
//    static class ThreadA extends Thread {
//        public void run() {
//            a = 1;
//            flag = true;
//        }
//    }
//
//    static class ThreadB extends Thread {
//        public void run() {
//            if (flag) {
//                a = a * 1;
//            }
//
//            if (a == 0) {
//                count++;
//                System.out.println(count);
//            }
//        }
//    }
}
