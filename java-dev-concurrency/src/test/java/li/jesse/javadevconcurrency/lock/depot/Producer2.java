package li.jesse.javadevconcurrency.lock.depot;

public class Producer2 {

    private Depot2 depot;

    public Producer2(Depot2 depot) {
        this.depot = depot;
    }

    // 消费产品：新建一个线程向仓库中生产产品。
    public void produce(final int val) {
        new Thread() {
            public void run() {
                depot.produce(val);
            }
        }.start();
    }
}
