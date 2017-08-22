package li.jesse.concurrency;

public class TicketRunnable implements Runnable
{
    private int ticketCount = 20;

    @Override
    public void run()
    {
        for (int i = 0; i < 200; i ++)
        {
            if (this.ticketCount > 0)
            {
                System.out.println(Thread.currentThread().getName() + " 卖票 ticket: " + this.ticketCount--);
            }
        }
    }

    public static void main(String[] arg)
    {
        TicketRunnable thread = new TicketRunnable();
        new Thread(thread).start();
        new Thread(thread).start();
        new Thread(thread).start();
    }
}
