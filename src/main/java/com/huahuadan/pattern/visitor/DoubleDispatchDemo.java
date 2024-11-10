package com.huahuadan.pattern.visitor;

/**
 * @author liuyichen
 * @version 1.0
 * @date 2024/11/9 19:49
 * @description 双分派是一种结合静态分派和动态分派的机制，通常在访问者模式中使用。双分派通过两次分派来最终确定方法的调用。
 *在Java中，可以利用方法的重载和重写机制来实现类似双分派的效果。
 *
 */
public class DoubleDispatchDemo {
    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee("Alice", 5000);
        Employee emp2 = new InternEmployee("Bob", 20, 120);

        Visitor calculator = new SalaryCalculator();

        emp1.accept(calculator); // 双分派：调用 emp1.accept()（第一次分派）后调用 calculator.visit()（第二次分派），
        // 调用accept是动态分派，jvm根据emp1的实际运行类型调用相应的方法，调用visit是静态分派，编译器这时候根据传入的emp，选择visit方法
        emp2.accept(calculator); // 同上
    }
}
