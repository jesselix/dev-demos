package li.jesse.javadevbasics.util;

public class StopwatchUtil {

    private final long timeStart;

    public StopwatchUtil() {
        timeStart = System.currentTimeMillis();
    }

    public double elapsedTime() {
        long timeNow = System.currentTimeMillis();
        return (timeNow - timeStart) / 1000.0;
    }
}
