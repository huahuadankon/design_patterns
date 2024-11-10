package com.huahuadan.pattern.factory.abstractfactory;

public class AppleFactory implements ElectronicsFactory {
    @Override
    public Phone createPhone() {
        return new SmartPhone(); // 创建智能手机
    }

    @Override
    public TV createTV() {
        return new SmartTV(); // 创建智能电视
    }
}