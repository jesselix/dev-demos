package li.jesse.javadevconcurrency.future.case2;

public class CommonCook {

    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        OnlineShopping thread = new OnlineShopping();
        thread.start();
        thread.join();
        Thread.sleep(2000);  // 模拟购买食材时间
        PrepareFood prepareFood = new PrepareFood();
        System.out.println("第二步：食材到位");
        // 第三步 用厨具烹饪食材
        System.out.println("第三步：开始展现厨艺");
        cook(thread.buyCookingPan, prepareFood);

        System.out.println("总共用时" + (System.currentTimeMillis() - startTime) + "ms");
    }

    static class OnlineShopping extends Thread {
        private BuyCookingPan buyCookingPan;

        @Override
        public void run() {
            System.out.println("Step 1: make order");
            System.out.println("Step 1: wait for delivery");

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("delivery arrives");
            buyCookingPan = new BuyCookingPan();
        }
    }

    static class BuyCookingPan {};

    static class PrepareFood {};

    static void cook(BuyCookingPan buyCookingPan, PrepareFood prepareFood) {};
}
