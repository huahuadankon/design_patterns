package com.huahuadan.principles.dependencyinversion;


public class IntelCpu implements Cpu {

    public void run() {
        System.out.println("使用Intel处理器");
    }
}
