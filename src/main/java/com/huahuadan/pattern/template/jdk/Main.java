package com.huahuadan.pattern.template.jdk;
//AQS就是典型的模板方法模式
public class Main {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        lock.lock();
        lock.unlock();
    }
}