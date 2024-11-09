package com.huahuadan.pattern.memento.white;

/**
 * @author liuyichen
 * @version 1.0
 * @date 2024/11/9 20:22
 * @description 备忘录对象管理对象
 */
public class RoleStateCaretaker {
    //声明RoleStateMemento类型的变量
    private RoleStateMemento roleStateMemento;

    public RoleStateMemento getRoleStateMemento() {
        return roleStateMemento;
    }

    public void setRoleStateMemento(RoleStateMemento roleStateMemento) {
        this.roleStateMemento = roleStateMemento; //管理者可以改变备忘录角色状态，封装性不好
    }
}
