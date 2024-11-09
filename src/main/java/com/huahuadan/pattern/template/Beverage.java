package com.huahuadan.pattern.template;

/**
 * @author liuyichen
 * @version 1.0
 * @date 2024/11/9 13:51
 * @description 饮料，抽象类，定义模板方法
 */
public abstract class Beverage {
    // 模板方法
    public final void prepareRecipe() {
        boilWater();//烧水
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();//添加调味品
        }
    }

    // 各个子类必须实现的方法
    abstract void brew();
    abstract void addCondiments();

    // 共同的步骤
    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    // 钩子方法
    boolean customerWantsCondiments() {
        return true;  // 默认行为，子类可以重写
    }
}
