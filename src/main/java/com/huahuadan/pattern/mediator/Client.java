package com.huahuadan.pattern.mediator;

/**
 * @author liuyichen
 * @version 1.0
 * @date 2024/11/9 18:54
 * @description 中介者模式（Mediator Pattern）是一种行为设计模式，用于减少多个对象或类之间的依赖关系。
 * 它通过一个中介者对象封装对象之间的交互，从而使各对象间不直接交互，减少耦合。
 * 中介者模式适合用在复杂的系统中，以简化对象之间的通信并控制交互逻辑，使得对象之间的交互变得更简单和清晰。
 * Executor 接口是一个任务执行的中介，客户端提交任务后，Executor 会根据其内部策略进行任务调度和执行，客户端不需要直接管理线程的创建和启动。
 * 降低耦合，集中控制
 */
public class Client {
    public static void main(String[] args) {
        ChatMediator chatRoom = new ChatRoom();

        User user1 = new ChatUser(chatRoom, "Alice");
        User user2 = new ChatUser(chatRoom, "Bob");
        User user3 = new ChatUser(chatRoom, "Charlie");

        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);

        user1.send("大家好！");
        user2.send("你好，Alice！");
    }
}
