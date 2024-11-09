package com.huahuadan.pattern.flyweight.jdk;

/**
 * @author liuyichen
 * @version 1.0
 * @date 2024/11/9 13:25
 * @description
 */
public class Demo {
    public static void main(String[] args) {
        //Integer 类中对 -128 到 127 范围内的整数对象进行了缓存。这意味着对于该范围内的整数对象，
        // JVM 会复用相同的对象实例，避免了不必要的重复创建
        Integer i1 = 127;
        Integer i2 = 127;
        System.out.println("i1是否与i2是同一个对象"+(i1 == i2));
        Integer i3 = 128;
        Integer i4 = 128;
        System.out.println("i3是否与i4是同一个对象"+(i3 == i4));
        //字符串常量池也是享元模式的应用
        String str1 = "abc";
        String str2 = "abc";
        System.out.println(str1 == str2);
        String str3 = new String("abc");
        System.out.println(str1 == str3);

    }
}
