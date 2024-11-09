package com.huahuadan.pattern.mediator;

/**
 * @author liuyichen
 * @version 1.0
 * @date 2024/11/9 18:52
 * @description 具体同事类 聊天用户
 */
public class ChatUser extends User {
    public ChatUser(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String message) {
        System.out.println(this.name + " 发送消息: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println(this.name + " 收到消息: " + message);
    }
}
