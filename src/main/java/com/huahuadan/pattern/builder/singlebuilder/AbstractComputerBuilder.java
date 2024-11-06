package com.huahuadan.pattern.builder.singlebuilder;

public abstract class AbstractComputerBuilder {
    protected Computer computer = new Computer.ComputerBuilder().build();

    public abstract AbstractComputerBuilder buildMemory(String memory);
    public abstract AbstractComputerBuilder buildCpu(String cpu);
    public abstract AbstractComputerBuilder buildGraphicsCard(String graphicsCard);
    public abstract AbstractComputerBuilder buildMotherboard(String motherboard);

    public Computer build() {
        return computer;
    }
}
