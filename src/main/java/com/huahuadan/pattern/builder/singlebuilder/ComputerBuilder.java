package com.huahuadan.pattern.builder.singlebuilder;

/**
 *
 */
public class ComputerBuilder extends AbstractComputerBuilder {

    @Override
    public AbstractComputerBuilder buildMemory(String memory) {
        computer.setMemory(memory);
        return this; // 返回当前实例用于链式调用
    }

    @Override
    public AbstractComputerBuilder buildCpu(String cpu) {
        computer.setCpu(cpu);
        return this;
    }

    @Override
    public AbstractComputerBuilder buildGraphicsCard(String graphicsCard) {
        computer.setGraphicsCard(graphicsCard);
        return this;
    }

    @Override
    public AbstractComputerBuilder buildMotherboard(String motherboard) {
        computer.setMotherboard(motherboard);
        return this;
    }
}
