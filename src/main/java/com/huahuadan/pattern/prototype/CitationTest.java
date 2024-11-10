package com.huahuadan.pattern.prototype;

import java.io.*;

/**
 * 原型模式的克隆分成深克隆和浅克隆两种
 * 浅克隆：创建一个新对象，新对象的属性和原来对象完全相同，对于非基本类型属性，仍指向原有属性所指向的对象的内存地址。
 * 深克隆：创建一个新对象，属性中引用的其他对象也会被克隆，不再指向原有对象地址。
 * 注意克隆出来的对象是不同的对象.
 */
public class CitationTest {
    //最后两种结果不一样其实就是
    public static void main(String[] args) throws Exception {
        //String是不可变类,给对象的String类型字段赋值实际是产生了一个新的String字符串,因此引用也变了,天然是深拷贝.
        CitationShallow cs1 = new CitationShallow();
        cs1.setName("张三");
        //复制奖状
        CitationShallow cs2 = cs1.clone();
        //将奖状的名字修改李四
        cs2.setName("李四");
        System.out.println(cs2==cs1);
        cs1.show();
        cs2.show();

        System.out.println("=================================");
        /*CitationDeep cd1 = new CitationDeep();
        Student stu = new Student("张三", "西安");
        cd1.setStu(stu);
        //复制奖状
        CitationDeep cd2 = cd1.clone();
        //获取c2奖状所属学生对象
        Student stu1 = cd2.getStu();
        stu1.setName("李四");
        //判断stu对象和stu1对象是否是同一个对象
        System.out.println("stu和stu1是同一个对象？" + (stu == stu1));
        cd1.show();
        cd2.show();*/
        //实现深克隆可以利用对象的序列化和反序列化
        CitationDeep c1 = new CitationDeep();
        Student stu = new Student("张三", "西安");
        c1.setStu(stu);

        //创建对象输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\123\\b.txt"));
        //将c1对象写出到文件中
        oos.writeObject(c1);
        oos.close();

        //创建对象出入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\123\\b.txt"));
        //读取对象
        CitationDeep c2 = (CitationDeep) ois.readObject();
        //获取c2奖状所属学生对象
        Student stu1 = c2.getStu();
        stu1.setName("李四");

        //判断stu对象和stu1对象是否是同一个对象
        System.out.println("stu和stu1是同一个对象？" + (stu == stu1));

        c1.show();
        c2.show();
    }
}