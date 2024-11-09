package com.huahuadan.pattern.combination;

/**
 * @author liuyichen
 * @version 1.0
 * @date 2024/11/9 10:41
 * @description 菜单项，对应叶子节点
 */
public class MenuItem extends MenuComponent {

    public MenuItem(String name,int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void print() {
        for (int i = 0; i < level; i++) {
            System.out.print("--");
        }
        System.out.println(name);
    }
}
