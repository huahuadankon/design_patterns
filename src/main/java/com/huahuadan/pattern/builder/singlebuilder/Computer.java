package com.huahuadan.pattern.builder.singlebuilder;

/**
 * 这里使用静态内部类,实现链式编程
 */
public class Computer {
    private String memory;
    private String cpu;
    private String graphicsCard;
    private String motherboard;

    private Computer(ComputerBuilder builder) {
        this.memory = builder.memory;
        this.cpu = builder.cpu;
        this.graphicsCard = builder.graphicsCard;
        this.motherboard = builder.motherboard;
    }

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

    // 提供一个toString方法来查看对象内容
    @Override
    public String toString() {
        return "Computer{" +
                "memory='" + memory + '\'' +
                ", cpu='" + cpu + '\'' +
                ", graphicsCard='" + graphicsCard + '\'' +
                ", motherboard='" + motherboard + '\'' +
                '}';
    }

    // 静态内部类，充当建造者类
    public static class ComputerBuilder {
        private String memory;
        private String cpu;
        private String graphicsCard;
        private String motherboard;

        // 构造器可以选择性的设置不同的属性
        public ComputerBuilder setMemory(String memory) {
            this.memory = memory;
            return this;
        }

        public ComputerBuilder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public ComputerBuilder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public ComputerBuilder setMotherboard(String motherboard) {
            this.motherboard = motherboard;
            return this;
        }

        // 最终调用build方法来构建一个Computer对象
        public Computer build() {
            return new Computer(this);
        }
    }
}

