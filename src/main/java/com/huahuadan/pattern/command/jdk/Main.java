package com.huahuadan.pattern.command.jdk;

/**
 * 我们可以将 Runnable 及其运行机制视为命令模式中的几个主要角色：
 * Command：Runnable 接口就是一个命令接口，其 run() 方法类似于命令模式的 execute() 方法。
 * ConcreteCommand：实现了 Runnable 接口的类（如实现类 Task）就充当了具体命令实现类，它定义了具体的任务逻辑。
 * Invoker：Thread 类就是调用者。它持有 Runnable 对象，并在启动线程时调用 Runnable 的 run() 方法。
 * Receiver：没有明确的接收者，因为 Runnable 的实现类通常是自己负责执行操作。不过，我们可以认为 Runnable 的实现类本身既是命令的定义者也是执行者。
 * Client：客户端代码负责创建 Runnable 对象，并将其传递给 Thread，使任务得以执行。
 */
public class Main {
    public static void main(String[] args) {
        // 命令对象（具体任务）
        Runnable printHelloTask = new PrintTask("Hello");
        Runnable printWorldTask = new PrintTask("World");

        // 调用者（Invoker）：线程对象
        Thread thread1 = new Thread(printHelloTask);
        Thread thread2 = new Thread(printWorldTask);

        // 执行命令
        thread1.start(); // 输出 "Executing task: Hello"
        thread2.start(); // 输出 "Executing task: World"
    }
}
