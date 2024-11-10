package com.huahuadan.pattern.strategy.jdk;

import java.util.concurrent.*;

public class ThreadPool {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
            1, 1, 0L, TimeUnit.MILLISECONDS,
            new LinkedBlockingQueue<>(1),
            new ThreadPoolExecutor.CallerRunsPolicy()//拒绝策略，策略模式的体现
        );

        // 提交三个任务，超过线程池和队列容量
        for (int i = 0; i < 3; i++) {
            executor.submit(() -> {
                System.out.println(Thread.currentThread().getName() + " is executing task");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
        executor.shutdown();
    }
}
