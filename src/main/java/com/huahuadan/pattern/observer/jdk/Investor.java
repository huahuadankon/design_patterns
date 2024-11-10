package com.huahuadan.pattern.observer.jdk;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * @author liuyichen
 * @version 1.0
 * @date 2024/11/9 17:07
 * @description 具体观察者
 */
public class Investor implements PropertyChangeListener {
    private final String name;

    public Investor(String name) {
        this.name = name;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        // 当被观察者的价格发生变化时，接收更新通知
        System.out.println("通知 " + name + ": 股票 " + ((Stock) evt.getSource()).getStockName()
                + " 的新价格是 " + evt.getNewValue());
    }
}
