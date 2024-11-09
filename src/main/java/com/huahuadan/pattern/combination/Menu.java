package com.huahuadan.pattern.combination;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuyichen
 * @version 1.0
 * @date 2024/11/9 10:40
 * @description 菜单，对应树枝节点
 */
public class Menu extends MenuComponent{

    private List<MenuComponent> arrayList = new ArrayList<>();//存抽象父类类型

    public Menu(String name,int level){
        this.name=name;
        this.level=level;
    }


    //添加子节点
    @Override
    public void add(MenuComponent component) {
        arrayList.add(component);
    }
    //移除子节点
    @Override
    public void remove(MenuComponent component) {
        arrayList.remove(component);
    }
    //获取指定的子节点
    @Override
    public MenuComponent getChildAt(int childIndex) {
        return arrayList.get(childIndex);
    }


    @Override
    public void print() {
        //打印菜单名字
        for (int i = 0; i < level; i++) {
            System.out.print("--");
        }
        System.out.println(name);
        //打印子菜单项的名字,
        arrayList.forEach(MenuComponent::print);
    }
}
