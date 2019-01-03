package li.jesse.javadevconcurrency.future;

public class FutureData<T> {

    private boolean mIsReady = false;
    private T mData;

    public synchronized void setData(T data) {
        mIsReady = true;
        mData = data;

        notifyAll();
    }

    public synchronized T getData() {
        while (!mIsReady) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return mData;
    }
}
