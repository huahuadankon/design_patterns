package com.huahuadan.pattern.proxy.static_proxy;

/**
 * 代理火车站卖票，静态代理的核心就是用户访问对象不适合或者不能直接引用目标对象，而是用代理对象作为访问对象和目标对象之间的中介。
 * 这样做的好处就是可以在代理对象的方法中对卖票行为做增强。用户就不必亲自执行一些繁琐的操作。
 */
public class ProxyPoint implements SellTickets {

    //声明火车站类对象
    private TrainStation trainStation  = new TrainStation();

    public void sell() {
        System.out.println("代售点收取一些服务费用");
        trainStation.sell();
    }

}
