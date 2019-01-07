package li.jesse.javadevconcurrency.threadstates.case1;

public class ThreadWait {

    public static void main(String[] args) {
        System.out.println("001");
        try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("002");
    }
}
