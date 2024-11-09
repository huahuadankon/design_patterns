package com.huahuadan.pattern.visitor;

/**
 * @author liuyichen
 * @version 1.0
 * @date 2024/11/9 19:32
 * @description 访问者模式（Visitor Pattern）是一种行为设计模式，允许我们在不改变各元素类的前提下定义作用于这些类的新操作。
 * 访问者模式的核心思想是将操作（行为）与对象结构分离，使得可以在不修改结构的前提下添加新的操作。
 * 优点:
 * 易于扩展：可以在不修改对象结构的前提下，添加新的访问者来扩展新的操作。
 * 符合单一职责原则：将操作逻辑从数据结构中分离，提高了代码的可读性和维护性。
 * 灵活性强：在不改变原有类的基础上，通过增加访问者实现对数据的不同操作。
 * 缺点
 * 违反了依赖倒置原则：访问者依赖具体元素类的方法，不适用于频繁变更的类结构。
 * 破坏了封装性：访问者需要访问元素的内部数据，可能导致对元素内部状态的依赖增加。
 * 结构不稳定：如果元素类频繁变化，则访问者模式的维护成本较高。
 */
public class Client {
    public static void main(String[] args) {
        EmployeeStructure structure = new EmployeeStructure();

        // 添加员工
        structure.addEmployee(new FullTimeEmployee("Alice", 5000));
        structure.addEmployee(new InternEmployee("Bob", 20, 120));

        // 计算薪资
        SalaryCalculator calculator = new SalaryCalculator();
        structure.accept(calculator);
    }
}
