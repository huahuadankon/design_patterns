package com.huahuadan.pattern.factory.abstractfactory;

public class SmartPhone implements Phone {
    @Override
    public void create() {
        System.out.println("创建一部智能手机");
    }
}