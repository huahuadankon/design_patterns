package com.huahuadan.pattern.combination;

import java.awt.*;
import java.util.concurrent.locks.Condition;

/**
 * @author liuyichen
 * @version 1.0
 * @date 2024/11/9 10:41
 * @description 菜单组件，对应抽象根节点
 */
public abstract class MenuComponent {
    //组件名称
    protected String name;
    //层级
    protected int level;

    //添加子节点
    public void add(MenuComponent component) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    //移除子节点
    public void remove(MenuComponent component) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    //获取指定的子节点
    public MenuComponent getChildAt(int childIndex) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public String getName(){
        return name;
    }
    //打印菜单名称，包含子菜单和菜单项
    public abstract void print();

}
