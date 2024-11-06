package com.huahuadan.pattern.singleton;

/**
 * @author liuyichen
 * @version 1.0
 * 饿汉式创建单例模式，缺点是类加载都会创建对象。优点是实现简单，没有线程安全问题
 * 第一次通过getInstance访问instance的时候进行类加载，这时候instance初始化，
 * private static HungrySingleton instance = new HungrySingleton();
 * 就让instance的引用指向的一个实例对象，而这个实例对象也是在类加载的时候创建的。
 * 后续访问instance的时候不会再次加载类，也不会初始化，这样instance的引用始终指向的是一个实例。
 *
 *
 * tips：对象的创建依赖于类的加载。换句话说，类必须已经加载到内存中，才能创建该类的对象。这意味着类加载的时机比对象创建的时机更早。
 * 当你调用 new 关键字或者通过反射机制来创建对象时，JVM 会确保类已经加载并且可以使用。
 * 加载类时，JVM 会先查找类路径，找到 .class 文件，并将其读取到内存中
 * 类加载不等于对象创建：一个类的加载和它的对象创建是两个不同的过程。类加载发生一次，而对象创建可以发生多次。
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
