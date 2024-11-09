package com.huahuadan.pattern.state;

/**
 * 状态模式（State Pattern）是一种行为设计模式，用于对象在不同状态下具有不同行为的情况。通过将状态相关的行为分离到独立的状态类中，使得状态的切换对使用该对象的客户端透明。
 * 状态模式允许对象在状态改变时改变其行为，就像对象从一个类变成另一个类。
 * 关键概念：
 * 状态模式将状态抽象成独立的类，使得不同状态下的行为被分布到不同的状态类中。
 * 通过状态对象的切换，客户端不需要关心对象当前的状态，也无需在逻辑中加入大量 if-else 或 switch 语句。
 */
public class Client {
    public static void main(String[] args) {
        //创建环境角色对象
        Context context = new Context();
        //设置当前电梯装填
        context.setLiftState(new ClosingState());

        context.open();
        context.run();
        context.close();
        context.stop();
    }
}
