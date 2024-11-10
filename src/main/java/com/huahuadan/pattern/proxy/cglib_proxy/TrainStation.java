package com.huahuadan.pattern.proxy.cglib_proxy;

import com.huahuadan.pattern.proxy.jdk_dynamic_proxy.SellTickets;

/**
 * 火车站类
 */
public class TrainStation implements SellTickets {

    public void sell() {
        System.out.println("火车站卖票");
    }
}
