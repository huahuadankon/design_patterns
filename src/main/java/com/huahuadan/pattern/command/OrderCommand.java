package com.huahuadan.pattern.command;

import java.util.Map;
import java.util.Set;

/**
 * ConcreteCommand（具体命令类）：实现命令接口，定义命令的具体执行逻辑。通常会持有一个接收者对象，调用接收者的具体操作
 */
public class OrderCommand implements Command {

    //持有接收者对象
    private SeniorChef receiver;
    private Order order;

    public OrderCommand(SeniorChef receiver, Order order) {
        this.receiver = receiver;
        this.order = order;
    }

    public void execute() {
        System.out.println(order.getDiningTable() + "桌的订单：");
        Map<String, Integer> foodDir = order.getFoodDir();
        //遍历map集合
        Set<String> keys = foodDir.keySet();
        for (String foodName : keys) {
            receiver.makeFood(foodName, foodDir.get(foodName));
        }

        System.out.println(order.getDiningTable() + "桌的饭准备完毕！！！");
    }
}
