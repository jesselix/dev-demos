package li.jesse.concurrency;

public class AnonymousInnerClassThread {

    public static void main(String[] args) {

        // thread
        new Thread() {
            public void run() {
                for (int x = 0; x < 5; x++) {
                    System.out.println("thread: " + Thread.currentThread().getName() + " -- " + x);
                }
            }
        }.start();

        // runnable
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int x = 0; x < 5; x++) {
                    System.out.println("runnable: " + Thread.currentThread().getName() + " -- " + x);
                }
            }
        }) {
        }.start();

        // lambda
        new Thread(() ->{
            for (int x = 0; x < 5; x++) {
                System.out.println("lambda: " + Thread.currentThread().getName() + " -- " + x);
            }}).start();

        // thread + runnable
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int x = 0; x < 5; x++) {
                    System.out.println("mix: runnable" + " -- " + x);
                }
            }
        }) {
            public void run() {
                for (int x = 0; x < 5; x++) {
                    System.out.println("mix: thread" + " -- " + x);
                }
            }
        }.start();
    }
}
