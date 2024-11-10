package com.huahuadan.pattern.visitor;

/**
 * @author liuyichen
 * @version 1.0
 * @date 2024/11/9 19:29
 * @description 具体员工类，实习员工
 */
public class InternEmployee implements Employee{
    private String name;
    private double hourlyRate;
    private int hoursWorked;

    public InternEmployee(String name, double hourlyRate, int hoursWorked) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public String getName() {
        return name;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
