package com.huahuadan.pattern.singleton;

/**
 * @author liuyichen
 * @version 1.0
 */
public class Demo {
    public static void main(String[] args) {
        LazySingleton2 lazySingleton = LazySingleton2.getInstance();
        LazySingleton2 instance = LazySingleton2.getInstance();
        System.out.println(lazySingleton == instance);
    }
}
