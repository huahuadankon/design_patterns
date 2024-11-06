package com.huahuadan.pattern.builder.morebuilder;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();

        // 构建游戏电脑
        Computer.Builder gamingBuilder = new GamingComputerBuilder();
        Computer gamingComputer = director.buildComputer(gamingBuilder);
        System.out.println("Gaming Computer: " + gamingComputer);

        // 构建办公电脑
        Computer.Builder officeBuilder = new OfficeComputerBuilder();
        Computer officeComputer = director.buildComputer(officeBuilder);
        System.out.println("Office Computer: " + officeComputer);
    }
}
