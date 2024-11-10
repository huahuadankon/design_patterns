package com.huahuadan.pattern.interpreter;

/**
 * @author liuyichen
 * @version 1.0
 * @date 2024/11/9 20:52
 * @description 实现非终结符表达式（加法和减法）
 * 加法和减法表达式是非终结符表达式，用于组合其他表达式。
 */
public class AdditionExpression implements Expression {
    private Expression leftExpression;
    private Expression rightExpression;

    public AdditionExpression(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public int interpret() {
        return leftExpression.interpret() + rightExpression.interpret();
    }
}


