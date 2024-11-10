package com.huahuadan.pattern.factory.abstractfactory;

public class SmartTV implements TV {
    @Override
    public void create() {
        System.out.println("创建一台智能电视");
    }
}