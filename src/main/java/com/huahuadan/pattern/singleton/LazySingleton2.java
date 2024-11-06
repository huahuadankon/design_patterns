package com.huahuadan.pattern.singleton;

import java.io.Serializable;

/**
 * @author liuyichen
 * @version 1.0
 *在 LazySingleton2 的 getInstance() 方法调用时，LazyHolder 类会被加载，并且 INSTANCE 变量会被初始化。
 * 由于类的初始化过程是线程安全的（JVM会确保每个类只初始化一次），因此保证了 LazySingleton2 的实例在多线程环境中的唯一性和安全性。
 * 静态内部类不会因为外部类加载而加载。而且JVM会保证类只加载一次，外部类和静态内部类都是这样。
 */
public class LazySingleton2 implements Serializable {
    private static LazySingleton2 instance;
    private static boolean flag = false;

    // 私有构造函数，防止外部直接实例化

    private LazySingleton2() {
        /**
         * 这样就可以防止反射破解单例模式，反射调用构造方法直接抛出异常
         */
        synchronized (LazySingleton2.class) {
            if(flag){
                throw new RuntimeException("不能创建多个对象");
            }
            flag = true;
        }
    }

    // 静态内部类，持有单例实例
    private static class LazyHolder {
        // 静态初始化器，JVM保证INSTANCE只会被初始化一次，所以再次访问这个INSTANCE就不会再次创建对象，JVM中保存了副本。
        private static final LazySingleton2 INSTANCE = new LazySingleton2();
    }

    // 提供全局访问接口
    public static LazySingleton2 getInstance() {
        return LazyHolder.INSTANCE;
    }

    /**
     * 下面是为了解决序列化反序列化破解单例模式,但反序列化时，readObject就会直接读取这个方法的返回值
     */
    private Object readResolve() {
        return LazyHolder.INSTANCE;
    }
}