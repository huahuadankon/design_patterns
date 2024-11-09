package com.huahuadan.pattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Invoker（调用者）：持有命令对象，并在需要时执行命令。Invoker 不关心命令如何执行，只需调用 execute() 方法。
 */
public class Waitor {

    //持有多个命令对象
    private List<Command> commands = new ArrayList<Command>();

    public void setCommand(Command cmd) {
        //将cmd对象存储到list集合中
        commands.add(cmd);
    }

    //发起命令功能  喊 订单来了
    public void orderUp() {
        System.out.println("美女服务员：大厨，新订单来了。。。。");
        //遍历list集合
        for (Command command : commands) {
           if(command != null) {
               command.execute();
           }
        }
    }
}
