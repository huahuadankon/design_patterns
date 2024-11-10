package com.huahuadan.pattern.interpreter;

/**
 * @author liuyichen
 * @version 1.0
 * @date 2024/11/9 20:55
 * @description 核心思想：解释器模式将解释和解析的逻辑从语法结构中分离出来，通过递归组合表达式类实现对复杂表达式的解释。
 * 优缺点：解释器模式使解析器结构清晰易扩展，但性能较低，不适合解析复杂语言或大规模系统。
 * 应用场景：主要用于简单脚本语言、表达式计算、文本处理、业务规则引擎等。
 */
public class InterpreterExample {
    public static void main(String[] args) {
        // 表示表达式：5 + 3 - 2
        Expression five = new NumberExpression(5);
        Expression three = new NumberExpression(3);
        Expression two = new NumberExpression(2);

        // 5 + 3
        Expression add = new AdditionExpression(five, three);
        // (5 + 3) - 2
        Expression subtract = new SubtractionExpression(add, two);

        int result = subtract.interpret();
        System.out.println("Expression Result: " + result); // 输出 6
    }
}
