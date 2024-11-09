package com.huahuadan.pattern.facade;

/**
 * 外观模式，又叫门面模式。
 * 好处：
 * 降低了子系统与客户端之间的耦合度，使得子系统的变化不会影响调用它的客户类。
 * 对客户屏蔽了子系统组件，减少了客户处理的对象数目，并使得子系统使用起来更加容易。
 *缺点：不符合开闭原则，修改很麻烦
 * 外观模式和代理模式的区别
 * 外观模式：简化系统的使用接口，将多个复杂操作封装在一个简单接口中，减少客户端的复杂性。
 * 代理模式：控制对特定对象的访问，通常用于延迟加载、控制权限或增强功能等。
 * java web中的外观模式
 * HttpServletRequest 通过外观模式，向开发者提供了对 HTTP 请求数据的简化访问方式，
 * 使得开发者只需操作请求对象即可完成对 HTTP 请求数据的读取，不必关心底层的解析和处理逻辑
 */
public class Client {
    public static void main(String[] args) {
        //创建智能音箱对象
        SmartAppliancesFacade facade = new SmartAppliancesFacade();
        //控制家电
        facade.say("打开家电");

        System.out.println("==================");

        facade.say("关闭家电");
    }
}
