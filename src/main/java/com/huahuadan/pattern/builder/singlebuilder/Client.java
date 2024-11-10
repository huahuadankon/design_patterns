package com.huahuadan.pattern.builder.singlebuilder;

/**
 * 建造者模式,客户
 */
public class Client {
    public static void main(String[] args) {

        AbstractComputerBuilder builder = new ComputerBuilder();
        ComputerDirector director = new ComputerDirector(builder);

        Computer gamingComputer = director.buildGamingComputer();
        System.out.println("Gaming Computer: " + gamingComputer);

        Computer officeComputer = director.buildOfficeComputer();
        System.out.println("Office Computer: " + officeComputer);

        //测试链式编程
        Computer computer = new Computer.ComputerBuilder()
                .setMemory("1")
                .setCpu("2")
                .setGraphicsCard("3")
                .setMotherboard("4")
                .build();
        System.out.println("Computer: " + computer);
    }
}
