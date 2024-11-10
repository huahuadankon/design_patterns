package com.huahuadan.pattern.mediator;

/**
 * @author liuyichen
 * @version 1.0
 * @date 2024/11/9 18:50
 * @description 中介者接口
 */
public interface ChatMediator {
    void sendMessage(String message, User user);
    void addUser(User user);
}
