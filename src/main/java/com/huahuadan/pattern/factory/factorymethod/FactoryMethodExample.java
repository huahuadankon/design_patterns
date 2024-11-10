package com.huahuadan.pattern.factory.factorymethod;

/**
 * 优点：
 * 用户只需要知道具体工厂的名称就可得到所要的产品，无须知道产品的具体创建过程；
 * 在系统增加新的产品时只需要添加具体产品类和对应的具体工厂类，无须对原工厂进行任何修改，满足开闭原则；
 *缺点：
 * 每增加一个产品就要增加一个具体产品类和一个对应的具体工厂类，这增加了系统的复杂度。容易产生类爆炸
 */
public class FactoryMethodExample {
    public static void main(String[] args) {
        ProductFactory phoneFactory = new PhoneFactory();  // 创建手机工厂
        Product phone = phoneFactory.createProduct();     // 创建手机产品
        phone.create();  // 输出：创建一部手机

        ProductFactory tvFactory = new TVFactory();       // 创建电视工厂
        Product tv = tvFactory.createProduct();           // 创建电视产品
        tv.create();  // 输出：创建一台电视
    }
}
