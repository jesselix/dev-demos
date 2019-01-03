package li.jesse.javadevconcurrency.future;

public class Client {

    public static void main(String[] args) {
        Server server = new Server();
        FutureData<String> futureData = server.getString();

//先执行其他操作
        String hello = "hello";
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(hello + " " + futureData.getData());
    }
}
