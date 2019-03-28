package li.jesse.javadevconcurrency.juc.tools;

import java.util.concurrent.Exchanger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExchangerTest {

    private static Exchanger<String> exchanger = new Exchanger();

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2);

        service.execute(() -> {
            try {
                String girl = exchanger.exchange("i like you");
                System.out.println("girl says " + girl);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        service.execute(() -> {
            try {
                TimeUnit.SECONDS.sleep(3);
                String boy = exchanger.exchange("i love you");
                System.out.println("boy says " + boy);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }
}
