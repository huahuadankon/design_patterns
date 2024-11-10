package com.huahuadan.pattern.builder.morebuilder;

// Product: Computer类
public class Computer {
    private String memory;
    private String cpu;
    private String graphicsCard;
    private String motherboard;


     Computer() {}

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "memory='" + memory + '\'' +
                ", cpu='" + cpu + '\'' +
                ", graphicsCard='" + graphicsCard + '\'' +
                ", motherboard='" + motherboard + '\'' +
                '}';
    }

    // 生成器接口，定义创建各个部件的方法
    public interface Builder {
        void buildMemory();
        void buildCpu();
        void buildGraphicsCard();
        void buildMotherboard();
        Computer getComputer();
    }
}
