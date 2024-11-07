package com.huahuadan.pattern.proxy.jdk_dynamic_proxy;




public class Client {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        SellTickets proxyFactorySellTickets = proxyFactory.getSellTicketsProxy();
        proxyFactorySellTickets.sell();
    }
}
