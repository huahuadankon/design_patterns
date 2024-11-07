package com.huahuadan.pattern.proxy.jdk_dynamic_proxy;

/**
 * 火车站类
 */
public class TrainStation implements SellTickets {

    public void sell() {
        System.out.println("火车站卖票");
    }
}
