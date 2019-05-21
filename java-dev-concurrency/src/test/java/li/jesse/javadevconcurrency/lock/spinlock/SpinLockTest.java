package li.jesse.javadevconcurrency.lock.spinlock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public class SpinLockTest {

    AtomicReference<Thread> atomicReference = new AtomicReference<>();

    public void myLock() {
        Thread thread = Thread.currentThread();
        System.out.println(Thread.currentThread().getName() + " want to get in");
        while(!atomicReference.compareAndSet(null, thread)) {

        }
        System.out.println(Thread.currentThread().getName() + " get in");
    }

    public void myUnlock() {
        Thread thread = Thread.currentThread();

        atomicReference.compareAndSet(thread, null);
        System.out.println(Thread.currentThread().getName() + " unlock");
    }

    public static void main(String[] args) {
        SpinLockTest spinLockTest = new SpinLockTest();

        new Thread(() -> {
            spinLockTest.myLock();
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            spinLockTest.myUnlock();
        }, "AA").start();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(() -> {
            spinLockTest.myLock();
            spinLockTest.myUnlock();
        }, "BB").start();
    }
}
