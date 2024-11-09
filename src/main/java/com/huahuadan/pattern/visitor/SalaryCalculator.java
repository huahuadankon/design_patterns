package com.huahuadan.pattern.visitor;

/**
 * @author liuyichen
 * @version 1.0
 * @date 2024/11/9 19:30
 * @description 具体访问类，薪资计算
 */
public class SalaryCalculator implements Visitor {
    @Override
    public void visit(FullTimeEmployee employee) {
        double monthlySalary = employee.getSalary();
        System.out.println("全职员工 " + employee.getName() + " 的月薪是 " + monthlySalary);
    }

    @Override
    public void visit(InternEmployee employee) {
        double totalSalary = employee.getHourlyRate() * employee.getHoursWorked();
        System.out.println("实习员工 " + employee.getName() + " 的工资是 " + totalSalary);
    }
}
