package com.huahuadan.pattern.strategy;

/**
 * @author liuyichen
 * @version 1.0
 * @date 2024/11/9 14:32
 * @description
 */
@SuppressWarnings("LombokSetterMayBeUsed")
public class PaymentContext {
    private PaymentStrategy paymentStrategy;//持有策略

    // 设置支付策略
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    // 执行支付
    public void executePayment(double amount) {
        if (paymentStrategy == null) {
            throw new IllegalStateException("Payment strategy not set");
        }
        paymentStrategy.pay(amount);
    }
}
