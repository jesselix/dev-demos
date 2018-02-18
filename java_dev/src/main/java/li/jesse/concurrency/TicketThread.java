package li.jesse.concurrency;

public class TicketThread extends Thread {
    private int ticketCount = 20;
    private String name;

    public TicketThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (this.ticketCount > 0) {
                System.out.println(this.name + " 卖票 " + (this.ticketCount--));
            }
        }
    }

    public static void main(String[] arg) {
        TicketThread t1 = new TicketThread("线程1");
        TicketThread t2 = new TicketThread("线程2");
        TicketThread t3 = new TicketThread("线程3");

        t1.start();
        t2.start();
        t3.start();
    }
}


