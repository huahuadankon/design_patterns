package com.huahuadan.pattern.builder.singlebuilder;

/**
 * 单个建造者 + 多个流程方法的 Director：Director 类中编写多个方法，每个方法对应不同的构建流程。可以灵活定义各种构建流程，
 * 但所有构建流程都集中在 Director 内部，适用于需求明确、流程种类有限的情况。
 *
 * 多个不同建造者 + 单个方法的 Director：使用多个不同的 Builder 实现类，每个实现类定义一种具体的构建流程。
 * Director 只负责调用传入的 Builder 进行构建，不直接管理构建细节。这种方式更符合“开闭原则”，因为添加新流程时不需要修改 Director，
 * 只需新增具体的 Builder 实现类。
 *
 * 如果需求相对稳定，且不同构建流程不多，使用 单个 Builder + 多流程方法的 Director 会更加简单高效。
 * 而如果需要灵活性或扩展性较高，多个不同 Builder + 单个方法的 Director 的方式更具优势。
 */
public class ComputerDirector {
    private AbstractComputerBuilder builder;

    public ComputerDirector(AbstractComputerBuilder builder) {
        this.builder = builder;
    }
   /* public Computer buildComputer() {
        return builder.build();
    }*/

    //
    public Computer buildGamingComputer() {
        return builder.buildMemory("16GB")
                .buildCpu("Intel i9")
                .buildGraphicsCard("NVIDIA RTX 3080")
                .buildMotherboard("ASUS ROG")
                .build();
    }

    public Computer buildOfficeComputer() {
        return builder.buildMemory("8GB")
                .buildCpu("Intel i5")
                .buildGraphicsCard("Integrated Graphics")
                .buildMotherboard("Generic Motherboard")
                .build();
    }
}
