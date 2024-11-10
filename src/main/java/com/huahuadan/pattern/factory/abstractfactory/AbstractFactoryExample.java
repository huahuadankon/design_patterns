package com.huahuadan.pattern.factory.abstractfactory;

/**
 * 抽象工厂模式适用于需要创建一组相关产品的场景，
 * 抽象工厂模式为产品族提供了一个接口，通过具体工厂来生产不同类型的产品。
 * 这个相比工厂方法模式的好处在于，增加一系列产品只用加一个工厂类，能够缓解类的爆炸。但是在某些情况却不符合开闭原则
 * 即新增一个类型的产品时，比如新增平板电脑这种产品，就需要改动原有代码，工厂的抽象类需要新增方法。
 * 这种模式相当于变相细化了产品，需要抽象的工厂提供更细化的方法,抽象工厂模式有多个抽象产品
 */
public class AbstractFactoryExample {
    public static void main(String[] args) {
        ElectronicsFactory appleFactory = new AppleFactory();  // 创建苹果工厂
        Phone applePhone = appleFactory.createPhone();        // 创建苹果智能手机
        TV appleTV = appleFactory.createTV();                 // 创建苹果智能电视
        applePhone.create();  // 输出：创建一部智能手机
        appleTV.create();     // 输出：创建一台智能电视

        ElectronicsFactory samsungFactory = new SamsungFactory();  // 创建三星工厂
        Phone samsungPhone = samsungFactory.createPhone();        // 创建三星功能手机
        TV samsungTV = samsungFactory.createTV();                  // 创建三星传统电视
        samsungPhone.create();  // 输出：创建一部功能手机
        samsungTV.create();     // 输出：创建一台传统电视
    }
}
