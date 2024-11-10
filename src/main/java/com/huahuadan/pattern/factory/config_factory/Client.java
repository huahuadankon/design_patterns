package com.huahuadan.pattern.factory.config_factory;

/**
 * @author liuyichen
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) throws Exception {
        Product tv = LazyObjectFactory.getProduct("TV");
        Product phone = LazyObjectFactory.getProduct("Phone");
        tv.create();
        System.out.println("==============");
        phone.create();
    }

}
