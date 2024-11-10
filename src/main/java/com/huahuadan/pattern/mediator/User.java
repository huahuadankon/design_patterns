package com.huahuadan.pattern.mediator;

/**
 * @author liuyichen
 * @version 1.0
 * @date 2024/11/9 18:51
 * @description 抽象同事类，用户
 */
public abstract class User {
    protected ChatMediator mediator;
    protected String name;

    public User(ChatMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void send(String message);

    public abstract void receive(String message);

}
