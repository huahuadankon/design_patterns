package com.huahuadan.pattern.factory.factorymethod;

/**
 * @author liuyichen
 * @version 1.0
 * 具体产品
 */
public class TV implements Product{
    @Override
    public void create() {
        System.out.println("创建电视");
    }
}
