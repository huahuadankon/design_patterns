package com.huahuadan.pattern.observer.jdk;

/**
 * 在 JDK 17 中，java.util.Observable 和 java.util.Observer 仍可用，
 * 但这些类自 JDK 9 起已被标记为过时。通常推荐使用其他更灵活的替代方案，比如 PropertyChangeListener
 */
public class Main {
    public static void main(String[] args) {
        // 创建被观察者（股票）
        Stock appleStock = new Stock("Apple", 150.0);

        // 创建观察者（投资者）
        Investor investor1 = new Investor("Alice");
        Investor investor2 = new Investor("Bob");

        // 注册观察者
        appleStock.addObserver(investor1);
        appleStock.addObserver(investor2);

        // 股票价格变化，通知所有观察者
        appleStock.setPrice(155.0);  // 输出：通知Alice和Bob
        appleStock.setPrice(160.0);  // 输出：通知Alice和Bob
    }
}