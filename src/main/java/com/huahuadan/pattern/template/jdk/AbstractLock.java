package com.huahuadan.pattern.template.jdk;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;

public abstract class AbstractLock extends AbstractQueuedSynchronizer {
    
    // 模板方法：锁的获取过程
    public final void lock() {
        if (tryAcquire(1)) {
            System.out.println(Thread.currentThread().getName() + " acquired the lock.");
        } else {
            acquire(1);
        }
    }

    // 钩子方法：具体子类实现的锁获取逻辑
    protected boolean tryAcquire(int acquires) {
        // 默认尝试获取锁的行为（返回 false 表示获取失败）
        return false;
    }

}