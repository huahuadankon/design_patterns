package com.huahuadan.pattern.factory.factorymethod;

/**
 * 具体工厂
 */
public class TVFactory implements ProductFactory {
    @Override
    public Product createProduct() {
        return new TV(); // 创建电视对象
    }
}