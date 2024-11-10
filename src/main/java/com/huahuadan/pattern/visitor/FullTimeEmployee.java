package com.huahuadan.pattern.visitor;

/**
 * @author liuyichen
 * @version 1.0
 * @date 2024/11/9 19:28
 * @description 具体元素类，全职员工
 */
public class FullTimeEmployee implements Employee {
    private String name;
    private double salary;

    public FullTimeEmployee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);//第二次分派，传递具体类型的员工
    }
}
