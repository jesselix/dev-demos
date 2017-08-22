package li.jesse.concurrency;

import org.junit.Test;

public class ThreadTest
{
    // http://www.cnblogs.com/lwbqqyumidi/p/3804883.html
    // http://mars914.iteye.com/blog/1508429

    @Test
    public void testTicket()
    {
        TicketThread t1 = new TicketThread("windows 1");
        TicketThread t2 = new TicketThread("windows 2");
        TicketThread t3 = new TicketThread("windows 3");

        t1.run();
        t2.run();
        t3.run();
    }

    @Test
    public void testTicket2()
    {
        TicketThread2 thread = new TicketThread2();
        new Thread(thread).start();
        new Thread(thread).start();
        new Thread(thread).start();
    }

    public static void main(String[] arg){
        TicketThread2 thread = new TicketThread2();
        new Thread(thread).start();
        new Thread(thread).start();
        new Thread(thread).start();
    }

    @Test
    public void testTicket3()
    {
        TicketThread3 t1 = new TicketThread3();
        new Thread(t1, "线程1").start();
        new Thread(t1, "线程2").start();
    }
}
