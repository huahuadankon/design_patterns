package com.huahuadan.pattern.observer;

/**
 * @author liuyichen
 * @version 1.0
 * @date 2024/11/9 16:54
 * @description 具体观察者
 */
class Investor implements Observer {
    private String name;

    public Investor(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockName, double price) {
        System.out.println("通知" + name + ": 股票 " + stockName + " 的新价格是 " + price);
    }
}
