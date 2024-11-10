package com.huahuadan.pattern.visitor;

/**
 * @author liuyichen
 * @version 1.0
 * @date 2024/11/9 19:27
 * @description 访问者接口
 */
interface Visitor {
    void visit(FullTimeEmployee employee);
    void visit(InternEmployee employee);
}
