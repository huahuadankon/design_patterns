package com.huahuadan.pattern.template;

/**
 * @author liuyichen
 * @version 1.0
 * @date 2024/11/9 13:56
 * @description 模板方法模式核心思想：它定义了一个操作中的算法框架，而将一些步骤的实现延迟到子类中。
 * 通过这种方式，模板方法模式能够让子类在不改变算法结构的情况下，重新定义算法中的某些步骤。
 * 模板方法模式的优点：
 * 代码复用：算法的核心部分在父类中定义，可以在多个子类中复用。
 * 扩展性：子类可以定制某些步骤的实现，而无需修改算法的结构。
 * 控制流程：父类控制整个流程，确保流程的一致性，避免子类的不当修改。
 */
public class Client {
    public static void main(String[] args) {
        Beverage coffee = new Coffee();
        Beverage tea = new Tea();

        System.out.println("Making coffee...");
        coffee.prepareRecipe();

        System.out.println("\nMaking tea...");
        tea.prepareRecipe();
    }
}
