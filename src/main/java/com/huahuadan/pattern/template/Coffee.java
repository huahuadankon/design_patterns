package com.huahuadan.pattern.template;

/**
 * @author liuyichen
 * @version 1.0
 * @date 2024/11/9 13:52
 * @description 具体类
 */
public class Coffee extends Beverage {
    @Override
    void brew() {
        System.out.println("Brewing coffee");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk");
    }

    // 可以选择性地重写钩子方法
    @Override
    boolean customerWantsCondiments() {
        return false;  // 咖啡用户通常不加调料
    }
}
