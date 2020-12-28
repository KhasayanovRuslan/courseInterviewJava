package homework3.task2;

import java.util.concurrent.locks.ReentrantLock;

public class LockThread extends Thread {
    String name;
    ReentrantLock lock;

    public LockThread(ReentrantLock lock, String name) {
        this.lock = lock;
        this.name = name;
    }

    public void run() {
        System.out.println("Запуск потока " + name);

        try {
            lock.lock();
            Shared.count++;
            System.out.println("Поток " + name + ": " + Shared.count);
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }
}
