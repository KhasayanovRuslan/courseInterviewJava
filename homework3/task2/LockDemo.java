package homework3.task2;

import java.util.concurrent.locks.ReentrantLock;

public class LockDemo {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();

        new LockThread(lock, "A").start();
        new LockThread(lock, "B").start();
        new LockThread(lock, "C").start();
        new LockThread(lock, "D").start();
    }
}
