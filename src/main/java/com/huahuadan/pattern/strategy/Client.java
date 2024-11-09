package com.huahuadan.pattern.strategy;

/**
  * @author liuyichen
  * @date  2024/11/9 14:34
  * @description 多个算法动态选择：在有多个算法可以选择的场景下使用，例如支付方式、排序方式等。
 * 行为需要随上下文变化：在不改变客户端代码的情况下，希望根据具体条件切换行为，例如日志策略（控制台、文件、远程服务器）。
 * 避免多重条件语句：如果代码中包含大量的 if-else 或 switch-case 条件判断，可以考虑用策略模式替换，提升代码可读性和扩展性。
 * 扩展性强：增加新的策略类，只需实现策略接口，符合开闭原则。
  * @version 1.0
  */
public class Client {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();

        // 使用信用卡支付
        paymentContext.setPaymentStrategy(new CreditCardPayment());
        paymentContext.executePayment(100.0);

        // 使用支付宝支付
        paymentContext.setPaymentStrategy(new AliPayPayment());
        paymentContext.executePayment(200.0);

        // 使用微信支付
        paymentContext.setPaymentStrategy(new WeChatPayPayment());
        paymentContext.executePayment(300.0);
    }
}
