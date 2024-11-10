package com.huahuadan.pattern.builder.morebuilder;
// OfficeComputerBuilder：办公电脑的构建器
public class OfficeComputerBuilder implements Computer.Builder {
    private Computer computer = new Computer();

    @Override
    public void buildMemory() {
        computer.setMemory("16GB DDR4");
    }

    @Override
    public void buildCpu() {
        computer.setCpu("Intel i5-12400");
    }

    @Override
    public void buildGraphicsCard() {
        computer.setGraphicsCard("Integrated Graphics");
    }

    @Override
    public void buildMotherboard() {
        computer.setMotherboard("ASUS B560");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}