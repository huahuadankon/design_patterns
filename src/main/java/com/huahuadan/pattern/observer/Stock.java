package com.huahuadan.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuyichen
 * @version 1.0
 * @date 2024/11/9 16:51
 * @description 具体被观察者对象
 */
public class Stock implements Subject {
    private String stockName;
    private double price;
    private List<Observer> observers = new ArrayList<>();

    public Stock(String stockName, double price) {
        this.stockName = stockName;
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
        notifyObservers();  // 通知所有观察者
    }

    public String getStockName() {
        return stockName;
    }

    public double getPrice() {
        return price;
    }


    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(stockName, price);
        }
    }
}
