package com.huahuadan.pattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuyichen
 * @version 1.0
 * @date 2024/11/9 19:31
 * @description 对象结构类，员工集合
 */
public class EmployeeStructure {
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void accept(Visitor visitor) {
        for (Employee employee : employees) {
            employee.accept(visitor);
        }
    }
}
