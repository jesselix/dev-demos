package li.jesse.aop.waiter;

public class NaiveWaiter implements Waiter {

    @Override
    public void greetTo(String name) {
        System.out.println("NaiveWaiter：greet to " + name + "...");
    }

    @Override
    public void serveTo(String name) {
        System.out.println("NaiveWaiter：serving to " + name + "...");
    }

    public void smile(String clientName, int times){
        System.out.println("NaiveWaiter:smile to  " + clientName + times + "times...");
    }
}
