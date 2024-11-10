package com.huahuadan.pattern.command.jdk;

// 任务定义（ConcreteCommand）：实现 Runnable，定义任务的具体逻辑
class PrintTask implements Runnable {
    private String message;

    public PrintTask(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        System.out.println("Executing task: " + message);
    }
}
