package com.huahuadan.pattern.observer.jdk;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 * @author liuyichen
 * @version 1.0
 * @date 2024/11/9 17:05
 * @description 具体被观察者
 */
public class Stock {
    private String stockName;
    private double price;
    private final PropertyChangeSupport support;  // 用于管理监听器和通知

    public Stock(String stockName, double price) {
        this.stockName = stockName;
        this.price = price;
        this.support = new PropertyChangeSupport(this);
    }

    public void setPrice(double price) {
        double oldPrice = this.price;
        this.price = price;
        // 当价格变化时，通知所有注册的监听器
        support.firePropertyChange("price", oldPrice, this.price);
    }

    public String getStockName() {
        return stockName;
    }

    // 添加观察者
    public void addObserver(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    // 移除观察者
    public void removeObserver(PropertyChangeListener listener) {
        support.removePropertyChangeListener(listener);
    }
}

