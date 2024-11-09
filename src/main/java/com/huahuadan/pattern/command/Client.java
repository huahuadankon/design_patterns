package com.huahuadan.pattern.command;

/**
 * Client（客户端）：创建具体命令对象，并将接收者与命令关联起来，将命令传递给调用者。
 * 命令模式（Command Pattern）是一种行为设计模式，它将请求封装成一个对象，从而使得不同的请求、队列或者日志能够以参数化的形式被处理。
 * 命令模式的核心思想是将“请求者”与“执行者”解耦，使得请求和执行分离，方便请求的存储、传递、撤销或重做操作。
 * 扩展性强：添加新的命令不需要修改已有的类结构，只需添加新的命令类。
 */
public class Client {
    public static void main(String[] args) {
        //创建第一个订单对象
        Order order1 = new Order();
        order1.setDiningTable(1);
        order1.setFood("西红柿鸡蛋面",1);
        order1.setFood("小杯可乐",2);

        //创建第二个订单对象
        Order order2 = new Order();
        order2.setDiningTable(2);
        order2.setFood("尖椒肉丝盖饭",1);
        order2.setFood("小杯雪碧",1);

        //创建厨师对象
        SeniorChef receiver = new SeniorChef();
        //创建命令对象
        OrderCommand cmd1 = new OrderCommand(receiver,order1);
        OrderCommand cmd2 = new OrderCommand(receiver,order2);

        //创建调用者（服务员对象）
        Waitor invoke = new Waitor();
        invoke.setCommand(cmd1);
        invoke.setCommand(cmd2);

        //让服务员发起命令
        invoke.orderUp();
    }
}
