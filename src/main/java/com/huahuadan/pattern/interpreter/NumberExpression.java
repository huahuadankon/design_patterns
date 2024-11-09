package com.huahuadan.pattern.interpreter;

/**
 * @author liuyichen
 * @version 1.0
 * @date 2024/11/9 20:51
 * @description 实现终结符表达式（数字）
 * 终结符表达式是指没有子表达式的基本单元，如数字。
 */
public class NumberExpression implements Expression {
    private int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    @Override
    public int interpret() {
        return number;
    }
}
