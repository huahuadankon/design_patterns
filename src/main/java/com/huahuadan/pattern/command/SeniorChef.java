package com.huahuadan.pattern.command;

/**
 * Receiver（接收者）：执行命令请求的实际对象，包含业务逻辑的具体实现。
 */
public class SeniorChef {

    public void makeFood(String name,int num) {
        System.out.println(num + "份" + name);
    }
}
