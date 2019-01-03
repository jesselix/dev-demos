package li.jesse.javadevconcurrency.future;

public class Server {

    public FutureData<String> getString() {
        final FutureData<String> data = new FutureData<>();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                data.setData("world");
            }
        }).start();

        return data;
    }
}
