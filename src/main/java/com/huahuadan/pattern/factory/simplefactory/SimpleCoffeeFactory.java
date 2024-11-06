package com.huahuadan.pattern.factory.simplefactory;

/**
 * 在开发中也有一部分人将工厂类中的创建对象的功能定义为静态的，
 * 这个就是静态工厂模式，它也不是23种设计模式中的。代码如下：
 * public class SimpleCoffeeFactory {
 *
 *     public static Coffee createCoffee(String type) {
 *         Coffee coffee = null;
 *         if("americano".equals(type)) {
 *             coffee = new AmericanoCoffee();
 *         } else if("latte".equals(type)) {
 *             coffee = new LatteCoffee();
 *         }
 *         return coffe;
 *     }
 * }
 */

/**
 * 封装了创建对象的过程，可以通过参数直接获取对象。把对象的创建和业务逻辑层分开，这样以后就避免了修改客户代码，
 * 如果要实现新产品直接修改工厂类，而不需要在原代码中修改，这样就降低了客户代码修改的可能性，更加容易扩展。
 * 增加新产品时还是需要修改工厂类的代码，违背了“开闭原则”。简单工厂模式并不属于23种设计模式。
 */

public class SimpleCoffeeFactory {

    public Coffee createCoffee(String type) {
        //声明Coffee类型的变量，根据不同类型创建不同的coffee子类对象
        Coffee coffee = null;
        if("american".equals(type)) {
            coffee = new AmericanCoffee();
        } else if("latte".equals(type)) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("对不起，您所点的咖啡没有");
        }

        return coffee;
    }
}
