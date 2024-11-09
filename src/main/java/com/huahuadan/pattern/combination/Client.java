package com.huahuadan.pattern.combination;

/**
 * @author liuyichen
 * @version 1.0
 * @date 2024/11/9 10:40
 * @description 组合模式
 *  组合模式可以清楚地定义分层次的复杂对象，表示对象的全部或部分层次，它让客户端忽略了层次的差异，方便对整个层次结构进行控制。
 *  客户端可以一致地使用一个组合结构或其中单个对象，不必关心处理的是单个对象还是整个组合结构，简化了客户端代码。
 *  在组合模式中增加新的树枝节点和叶子节点都很方便，无须对现有类库进行任何修改，符合“开闭原则”。
 *  组合模式为树形结构的面向对象实现提供了一种灵活的解决方案，通过叶子节点和树枝节点的递归组合，可以形成复杂的树形结构，但对树形结构的控制却非常简单。
 *  组合模式正是应树形结构而生，所以组合模式的使用场景就是出现树形结构的地方。比如：文件目录显示，多级目录呈现等树形结构数据的操作。
 *  组合模式的核心思想是：将叶子对象和组合对象（容器对象）都实现同一个接口，使客户端可以一致地使用它们。
 *  这不仅可以简化客户端的代码，还可以使结构更灵活，特别适用于具有树形结构的场景。
 */
public class Client {
    public static void main(String[] args) {
        //创建一级菜单
        MenuComponent menuComponent = new Menu("系统管理",1);
        //创建菜单树
        Menu menu1 = new Menu("菜单管理", 2);
        menu1.add(new MenuItem("页面访问",3));
        menu1.add(new MenuItem("展开菜单",3));
        menu1.add(new MenuItem("编辑菜单",3));
        menu1.add(new MenuItem("删除菜单",3));
        menu1.add(new MenuItem("新增菜单",3));

        Menu menu2 = new Menu("权限配置", 2);
        menu2.add(new MenuItem("页面访问",3));
        menu2.add(new MenuItem("提交保存",3));

        Menu menu3 = new Menu("角色管理", 2);
        menu3.add(new MenuItem("页面访问",3));
        menu3.add(new MenuItem("新增角色",3));
        menu3.add(new MenuItem("修改角色",3));

        //将二级菜单添加到一级菜单
        menuComponent.add(menu1);
        menuComponent.add(menu2);
        menuComponent.add(menu3);
        //这里的打印方法就无视了各种节点的差异,统一了，菜单和菜单项的操作，面向抽象编程。
        menuComponent.print();


    }
}
