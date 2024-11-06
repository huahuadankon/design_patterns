package com.huahuadan.pattern.factory.factorymethod;

/**
 * @author liuyichen
 * @version 1.0
 */
public class Phone implements Product{
    @Override
    public void create() {
        System.out.println("创建手机");
    }
}
