package li.jesse.call;

public class Student {

    Callback callback = null;

    public void setCallback(Callback callback) {
        this.callback = callback;
    }

    public void doTask() {
        for(int m = 1; m < 6; m++) {
            callback.taskResult(m + "是张三");
        }
    }
}
