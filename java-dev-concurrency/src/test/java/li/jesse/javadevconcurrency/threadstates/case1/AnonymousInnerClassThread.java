package li.jesse.javadevconcurrency.threadstates.case1;

public class AnonymousInnerClassThread {

    public static void main(String[] args) {

        // threadstates
        new Thread() {
            public void run() {
                for (int x = 0; x < 5; x++) {
                    System.out.println("threadstates: " + Thread.currentThread().getName() + " -- " + x);
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

        // threadstates + runnable
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
                    System.out.println("mix: threadstates" + " -- " + x);
                }
            }
        }.start();
    }
}
