package com.huahuadan.pattern.strategy;

// 微信支付
public class WeChatPayPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Using WeChat Pay to pay $" + amount);
    }
}