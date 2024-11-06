package com.huahuadan.pattern.factory.abstractfactory;

/**
 * 抽象工厂接口,定义工厂的的功能,工厂的功能还是生产产品,但是定义了具体生产什么产品,功能得到细化,抽象的工厂对实现自己的工厂也有了要求.
 * 细化了生产什么产品,当有一些列的产品需要添加时,只用创建一个工厂类即可.
 */
public interface ElectronicsFactory {
    Phone createPhone();
    TV createTV();
}