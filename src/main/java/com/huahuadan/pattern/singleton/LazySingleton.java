package com.huahuadan.pattern.singleton;

/**
 * @author liuyichen
 * @version 1.0
 * 这是懒汉式单例模式的实现，并且使用了双重检查锁的机制提高了并发能力，使用volatile关键字防止指令重排序
 */
public class LazySingleton {
    private static volatile LazySingleton instance;
    private LazySingleton() {}
    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
