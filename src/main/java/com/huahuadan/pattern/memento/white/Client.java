package com.huahuadan.pattern.memento.white;

/**
 * @author liuyichen
 * @version 1.0
 * @date 2024/11/9 20:24
 * @description 备忘录模式（Memento Pattern）是一种行为型设计模式，其核心思想是在不暴露对象内部状态的前提下，捕获并保存对象的状态，
 * 以便在需要时可以恢复到之前的状态。备忘录模式常用于实现撤销（Undo）和恢复（Redo）功能，使系统可以灵活地回溯到先前的状态。
 *  发起人（Originator）角色：记录当前时刻的内部状态信息，提供创建备忘录和恢复备忘录数据的功能，实现其他业务功能，它可以访问备忘录里的所有信息。
 *  备忘录（Memento）角色：负责存储发起人的内部状态，在需要的时候提供这些内部状态给发起人。
 *  管理者（Caretaker）角色：对备忘录进行管理，提供保存与获取备忘录的功能，但其不能对备忘录的内容进行访问与修改。
 * 备忘录有两个等效的接口：
 * 窄接口：管理者(Caretaker)对象（和其他发起人对象之外的任何对象）看到的是备忘录的窄接口(narror Interface)，
 * 这个窄接口只允许他把备忘录对象传给其他的对象。
 * 宽接口：与管理者看到的窄接口相反，发起人对象可以看到一个宽接口(wide Interface)，这个宽接口允许它读取所有的数据，
 * 以便根据这些数据恢复这个发起人对象的内部状态。
 * 白箱备忘录:备忘录角色对任何对象都提供一个接口，即宽接口，备忘录角色的内部所存储的状态就对所有对象公开。
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("---------------大战boos前-----------------");
        //创建游戏角色对象
        GameRole gameRole = new GameRole();
        gameRole.initState();//初始化状态操作
        gameRole.stateDisplay();

        //将该游戏角色内部状态进行备份
        //创建管理者对象
        RoleStateCaretaker roleStateCaretaker = new RoleStateCaretaker();
        roleStateCaretaker.setRoleStateMemento(gameRole.saveState());

        System.out.println("---------------大战boos后-----------------");
        //损耗严重
        gameRole.fight();
        gameRole.stateDisplay();

        System.out.println("---------------恢复之前的状态-----------------");
        gameRole.recoverState(roleStateCaretaker.getRoleStateMemento());
        gameRole.stateDisplay();
    }
}
