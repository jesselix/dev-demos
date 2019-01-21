package li.jesse.javadevconcurrency.threadstates.case2;

import org.junit.Test;

public class Sleep2Test {

    @Test
    public void testGo() throws InterruptedException {
        System.out.println("111");
        Thread.sleep(5000);
        System.out.println("222");
    }
}
