package com.huahuadan.pattern.strategy;

// 支付宝支付
public class AliPayPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Using Alipay to pay $" + amount);
    }
}