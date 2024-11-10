package com.huahuadan.pattern.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuyichen
 * @version 1.0
 * @date 2024/11/9 18:53
 * @description 具体中介类，聊天室
 */
public class ChatRoom implements ChatMediator{
    private List<User> users;

    public ChatRoom() {
        this.users = new ArrayList<>();
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User u : this.users) {
            // 消息发送给除了发送者以外的所有用户
            if (u != user) {
                u.receive(message);
            }
        }
    }
}
