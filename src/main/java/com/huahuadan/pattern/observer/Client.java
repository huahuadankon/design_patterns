package com.huahuadan.pattern.observer;

/**
 * @author liuyichen
 * @version 1.0
 * @date 2024/11/9 16:55
 * @description 观察者模式（Observer Pattern）是一种行为设计模式，定义了一种一对多的关系，使得一个对象（称为被观察者）的状态发生改变时，
 * 其所有依赖对象（称为观察者）都会收到通知并自动更新。观察者模式通常用于实现事件处理系统，比如用户界面更新、数据流更新等场景。
 * 观察者模式优缺点
 * 优点
 * 解耦：观察者模式将观察者与被观察者解耦，增加了系统的灵活性和可扩展性，便于动态添加或移除观察者。
 * 支持广播机制：被观察者的变化可以自动通知所有观察者，无需逐一通知。
 * 符合开闭原则：可以新增观察者而不修改被观察者的代码。
 * 缺点
 * 可能引起性能问题：如果观察者过多或更新频繁，可能会导致频繁通知，影响性能。
 * 可能导致循环依赖：在某些情况下，观察者和被观察者之间可能会相互依赖，造成难以跟踪的循环引用。
 * 通知顺序不确定：多个观察者接收到通知的顺序不一定确定，可能影响通知效果。
 */
public class Client {
    public static void main(String[] args) {
        // 创建被观察者（股票）
        Stock appleStock = new Stock("Apple", 150.0);

        // 创建观察者（投资者）
        Observer investor1 = new Investor("Alice");
        Observer investor2 = new Investor("Bob");

        // 注册观察者
        appleStock.registerObserver(investor1);
        appleStock.registerObserver(investor2);

        // 股票价格变化，通知所有观察者
        appleStock.setPrice(155.0);  // 输出：通知Alice和Bob
        appleStock.setPrice(160.0);  // 输出：通知Alice和Bob
    }
}
