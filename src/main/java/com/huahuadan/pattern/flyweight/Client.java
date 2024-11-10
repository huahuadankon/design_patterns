package com.huahuadan.pattern.flyweight;

/**
 * @version v1.0
 * @ClassName: Client
 * 享元模式通过共享对象来避免重复创建，享元模式特别适合大量相似小对象的场景，它能极大地减少对象的数量，从而降低内存占用。
 *享元模式的核心在于共享内部状态，并将对象的状态分为内部状态和外部状态：
 * 内部状态：对象共享的部分，不会随着环境的变化而改变。例如，字符的字体或大小在一定范围内可以共享。
 * 外部状态：对象独有的部分，会随着环境的变化而改变。例如，字符在文档中的具体位置。外部状态在每次使用时由客户端传入，并不保存在享元对象中。
 * 本例中对象的外部状态是颜色并不保存在对象之中，由外界传输进来，不用每次传输都创建不同的对象。
 *
 */
public class Client {
    public static void main(String[] args) {
        //获取I图形对象
        AbstractBox box1 = BoxFactory.getInstance().getShape("I");
        box1.display("灰色");

        //获取L图形对象
        AbstractBox box2 = BoxFactory.getInstance().getShape("L");
        box2.display("绿色");

        //获取O图形对象
        AbstractBox box3 = BoxFactory.getInstance().getShape("O");
        box3.display("灰色");

        //获取O图形对象
        AbstractBox box4 = BoxFactory.getInstance().getShape("O");
        box4.display("红色");

        System.out.println("两次获取到的O图形对象是否是同一个对象：" + (box3 == box4));
    }
}
