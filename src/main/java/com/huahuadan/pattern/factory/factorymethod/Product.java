package com.huahuadan.pattern.factory.factorymethod;

/**
 * @author liuyichen
 * @version 1.0
 * 产品接口,定义产品,无所谓什么产品,功能也无所谓,可以交给其他接口扩展.主要是为了标识产品类,能让工厂创建.同时也降低了耦合，依赖接口而不是具体类
 */
public interface Product {
    void create();
}
