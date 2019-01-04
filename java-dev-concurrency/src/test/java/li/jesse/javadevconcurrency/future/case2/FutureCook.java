package li.jesse.javadevconcurrency.future.case2;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class FutureCook {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        long startTime = System.currentTimeMillis();

        Callable<BuyCookingPan> onlineShopping = new Callable<BuyCookingPan>() {

            @Override
            public BuyCookingPan call() throws Exception {
                System.out.println("第一步：下单");
                System.out.println("第一步：等待送货");
                Thread.sleep(5000);  // 模拟送货时间
                System.out.println("第一步：快递送到");
                return new BuyCookingPan();
            }
        };

        FutureTask<BuyCookingPan> task = new FutureTask<BuyCookingPan>(onlineShopping);
        new Thread(task).start();
        // 第二步 去超市购买食材
        Thread.sleep(2000);  // 模拟购买食材时间
        PrepareFood prepareFood = new PrepareFood();
        System.out.println("第二步：食材到位");
        // 第三步 用厨具烹饪食材
        if (!task.isDone()) {  // 联系快递员，询问是否到货
            System.out.println("第三步：厨具还没到，心情好就等着（心情不好就调用cancel方法取消订单）");
        }
        BuyCookingPan buyCookingPan = task.get();
        System.out.println("第三步：厨具到位，开始展现厨艺");
        cook(buyCookingPan, prepareFood);

        System.out.println("总共用时" + (System.currentTimeMillis() - startTime) + "ms");
    }


    static class BuyCookingPan {};

    static class PrepareFood {};

    static void cook(BuyCookingPan buyCookingPan, PrepareFood prepareFood) {};
}
