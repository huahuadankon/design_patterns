package com.huahuadan.pattern.builder.morebuilder;

// GamingComputerBuilder：游戏电脑的构建器
public class GamingComputerBuilder implements Computer.Builder {
    private Computer computer = new Computer();

    @Override
    public void buildMemory() {
        computer.setMemory("32GB DDR4");
    }

    @Override
    public void buildCpu() {
        computer.setCpu("Intel i9-12900K");
    }

    @Override
    public void buildGraphicsCard() {
        computer.setGraphicsCard("NVIDIA RTX 3080");
    }

    @Override
    public void buildMotherboard() {
        computer.setMotherboard("MSI Z690");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}