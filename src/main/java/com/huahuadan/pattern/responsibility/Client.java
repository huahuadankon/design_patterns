package com.huahuadan.pattern.responsibility;

/**
 * 责任链模式的核心思想
 * 责任链模式（Chain of Responsibility）是一种行为设计模式，它将请求沿着处理者链进行传递，直到某个处理者对请求进行处理，或者链的末端没有处理者。
 * 每个处理者（也称为节点）都包含一个指向下一个处理者的引用，并决定自己是否处理该请求或将请求传递给链中的下一个处理者。
 * 这种模式实现了请求的处理者和请求发起者的解耦。
 * 责任链模式的优缺点
 * 优点
 * 降低耦合度：请求的发送者和处理者分开，发送者不需要了解链中各个处理者的细节。
 * 灵活性高：通过改变链内处理者的顺序或增加、删除处理者，可以轻松调整请求的处理流程，满足扩展需求。
 * 符合开闭原则：新的处理者可以灵活地加入链中，而无需修改其他处理者类。
 * 缺点
 * 链路过长导致性能问题：如果链中处理者太多，可能造成请求沿链传递时的延迟，影响性能。
 * 不易排查错误：因为请求在链中流转，难以追踪具体的处理过程或查找处理者。
 * 可能导致不被处理：如果没有处理者接手请求，可能导致请求得不到处理。
 * 责任链模式的应用场景
 * 日志处理：不同的日志处理级别（如 DEBUG、INFO、ERROR）可以形成责任链。请求在链中流转，每个处理者可以选择处理或忽略请求。
 * 权限校验：系统中可以使用责任链处理不同层级的权限校验，如验证用户身份、检查操作权限等。
 * 请求拦截器链：在 Web 应用中，多个拦截器组成责任链，比如身份验证拦截、日志记录拦截、参数检查拦截等。
 * 工作流审批：工作流中的审批流程可以用责任链模式，比如不同级别的管理人员审批同一请求，按照级别形成责任链。
 * 数据过滤和校验：在数据处理的场景中，可以用责任链模式进行数据校验，比如表单数据校验，每个处理者负责检查一个字段的有效性。
 */

public class Client {
    public static void main(String[] args) {
        //创建一个请假条对象
        LeaveRequest leave = new LeaveRequest("小明",8,"身体不适");

        //创建各级领导对象
        GroupLeader groupLeader = new GroupLeader();
        Manager manager = new Manager();
        GeneralManager generalManager = new GeneralManager();

        //设置处理者链
        groupLeader.setNextHandler(manager);
        manager.setNextHandler(generalManager);


        //小明提交请假申请
        groupLeader.submit(leave);
    }
}
