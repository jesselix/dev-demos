package li.jesse.basic;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class LambdaTest {

    @Test
    public void test01() {
//        int x = () -> 5;

        String[] atp = {"Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka",
                "David Ferrer","Roger Federer",
                "Andy Murray","Tomas Berdych",
                "Juan Martin Del Potro"};
        List<String> players =  Arrays.asList(atp);

        // 以前的循环方式
//        for (String player : players) {
//            System.out.print(player + "; ");
//        }

        // 使用 lambda 表达式以及函数操作(functional operation)
//        players.forEach((player) -> System.out.print(player + "; "));

        // 在 Java 8 中使用双冒号操作符(double colon operator)
        players.forEach(System.out::print);
    }

    @Test
    public void test02() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("x 1 !");
            }
        }).start();

        new Thread(() -> System.out.println("x 2 !")).start();

        Runnable race1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello 1 !");
            }
        };

        Runnable race2 = () -> System.out.println("Hello 2 !");

        race1.run();
        race2.run();
    }
}
