package com.huahuadan.pattern.factory.abstractfactory;

public class BasicTV implements TV {
    @Override
    public void create() {
        System.out.println("创建一台传统电视");
    }
}