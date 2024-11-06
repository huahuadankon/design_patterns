package com.huahuadan.pattern.factory.abstractfactory;

public class FeaturePhone implements Phone {
    @Override
    public void create() {
        System.out.println("创建一部功能手机");
    }
}