package li.jesse.concurrency;

public class TicketThread2 implements Runnable
{
    private int ticketCount = 20;

    @Override
    public void run()
    {
        for (int i = 0; i < 200; i ++) {
            if (this.ticketCount > 0) {
                System.out.println(Thread.currentThread().getName() + "卖票 ticket:" + this.ticketCount--);
            }
        }
    }
}
