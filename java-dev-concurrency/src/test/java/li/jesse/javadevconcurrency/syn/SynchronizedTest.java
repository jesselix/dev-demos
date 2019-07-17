package li.jesse.javadevconcurrency.syn;

public class SynchronizedTest {

    public void go() {
        synchronized (this) {
            System.out.println("gogogo");
        }
    }

    public static void main(String[] args) {
        SynchronizedTest ss = new SynchronizedTest();
        ss.go();
    }
}
