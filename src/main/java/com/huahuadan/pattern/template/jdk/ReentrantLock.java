package com.huahuadan.pattern.template.jdk;

// 具体实现：重入锁
public class ReentrantLock extends AbstractLock {

    private Thread currentThread;
    private int lockCount;

    @Override
    protected boolean tryAcquire(int acquires) {
        Thread thread = Thread.currentThread();
        if (thread == currentThread) {
            lockCount++;
            return true;
        }
        return false;
    }
    
    public void unlock() {
        if (lockCount > 0) {
            lockCount--;
            if (lockCount == 0) {
                currentThread = null;
            }
            System.out.println(Thread.currentThread().getName() + " released the lock.");
        }
    }
}