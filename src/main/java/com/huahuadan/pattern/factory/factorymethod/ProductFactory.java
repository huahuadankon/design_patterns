package com.huahuadan.pattern.factory.factorymethod;

/**
 * 抽象工厂接口,定义工厂的功能,工厂的职责只有一个那就是创建产品,
 * 无所谓什么产品,只需要交给实现的具体工厂即可,但是只要有新产品,就会有新工厂.
 */
public interface ProductFactory {
    Product createProduct();
}