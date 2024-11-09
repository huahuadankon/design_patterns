package com.huahuadan.principles.openclose;

/**
 * 软件实体应当对扩展开放，对修改关闭，即在不修改已有代码的情况下，通过扩展实现新功能
 */
public class Client {
    public static void main(String[] args) {
        //1,创建搜狗输入法对象
        SougouInput input = new SougouInput();
        //2,创建皮肤对象
        //DefaultSkin skin = new DefaultSkin();
        HeimaSkin skin = new HeimaSkin();
        //3,将皮肤设置到输入法中
        input.setSkin(skin);

        //4,显示皮肤
        input.display();
    }
}
