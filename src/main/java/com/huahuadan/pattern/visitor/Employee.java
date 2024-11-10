package com.huahuadan.pattern.visitor;

/**
 * @author liuyichen
 * @version 1.0
 * @date 2024/11/9 19:28
 * @description 元素接口 包含 accept 方法，接收访问者的访问。
 */
// 元素接口
interface Employee {
    void accept(Visitor visitor);
}
