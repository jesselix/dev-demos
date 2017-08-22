package li.jesse.concurrency;

public class TicketThread extends Thread
{
    private int ticketCount = 20;
    private String name;

    public TicketThread(String name)
    {
        this.name = name;
    }

    @Override
    public void run()
    {
        for (int i = 0; i < 100; i++)
        {
            if (this.ticketCount > 0)
            {
                System.out.println("vvv");
                System.out.println(this.name + "卖票 " + (this.ticketCount--));
            }
        }
    }

}
