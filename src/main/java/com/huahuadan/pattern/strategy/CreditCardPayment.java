package com.huahuadan.pattern.strategy;

// 信用卡支付
public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Using credit card to pay $" + amount);
    }
}