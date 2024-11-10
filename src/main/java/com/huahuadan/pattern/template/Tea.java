package com.huahuadan.pattern.template;

/**
 * @author liuyichen
 * @version 1.0
 * @date 2024/11/9 13:53
 * @description 具体类：茶
 */
public class Tea extends Beverage {

    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding lemon");
    }
}

