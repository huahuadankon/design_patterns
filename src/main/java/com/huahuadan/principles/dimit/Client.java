package com.huahuadan.principles.dimit;

/**
 * 迪米特法则（Law of Demeter，LoD），也称为最少知道原则，其核心思想是：
 * 一个对象应当尽量少地了解其他对象的内部情况，只与直接相关的对象通信，避免对外部的复杂依赖。这样可以减少模块之间的耦合度，使系统更易于维护和扩展。
 */
public class Client {
    public static void main(String[] args) {
        //创建经纪人类
        Agent agent = new Agent();
        //创建明星对象
        Star star = new Star("林青霞");
        agent.setStar(star);
        //创建粉丝对象
        Fans fans = new Fans("李四");
        agent.setFans(fans);
        //创建媒体公司对象
        Company company = new Company("黑马媒体公司");
        agent.setCompany(company);

        agent.meeting();//和粉丝见面
        agent.business();//和媒体公司洽谈业务
    }
}
