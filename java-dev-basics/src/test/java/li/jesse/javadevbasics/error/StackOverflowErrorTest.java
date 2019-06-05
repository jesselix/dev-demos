package li.jesse.javadevbasics.error;

public class StackOverflowErrorTest {

    public static void main(String[] args) {
        sof();
    }

    private static void sof() {
        sof();
    }
}
