package com.huahuadan.pattern.factory.factorymethod;

public class PhoneFactory implements ProductFactory {
    @Override
    public Product createProduct() {
        return new Phone(); // 创建手机对象
    }
}