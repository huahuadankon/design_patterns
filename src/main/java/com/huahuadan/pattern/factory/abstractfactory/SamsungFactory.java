package com.huahuadan.pattern.factory.abstractfactory;

public class SamsungFactory implements ElectronicsFactory {
    @Override
    public Phone createPhone() {
        return new FeaturePhone(); // 创建功能手机
    }

    @Override
    public TV createTV() {
        return new BasicTV(); // 创建传统电视
    }
}