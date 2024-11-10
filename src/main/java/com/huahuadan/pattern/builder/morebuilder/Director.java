package com.huahuadan.pattern.builder.morebuilder;

public class Director {
    // 构建流程，通过传入的具体Builder类型来构建对应类型的电脑
    public Computer buildComputer(Computer.Builder builder) {
        builder.buildMemory();
        builder.buildCpu();
        builder.buildGraphicsCard();
        builder.buildMotherboard();
        return builder.getComputer();
    }
}
