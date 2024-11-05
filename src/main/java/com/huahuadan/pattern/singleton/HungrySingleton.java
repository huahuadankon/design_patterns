package com.huahuadan.pattern.singleton;

/**
 * @author liuyichen
 * @version 1.0
 * 饿汉式创建单例模式，缺点是每次类加载都会创建对象。优点是实现简单，没有线程安全问题
 */
public class HungrySingleton {

    private static HungrySingleton instance = new HungrySingleton();
    /*static {
        instance = new HungrySingleton();
    }*/
    private HungrySingleton() {}
    public static HungrySingleton getInstance() {
        return instance;
    }
}
