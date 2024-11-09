package com.huahuadan.pattern.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * @author liuyichen
 * @version 1.0
 */
public class Demo {
    public static void main(String[] args) throws Exception {
        /*LazySingleton2 lazySingleton = LazySingleton2.getInstance();
        LazySingleton2 instance = LazySingleton2.getInstance();
        System.out.println(lazySingleton == instance);*/
        //1,获取Singleton的字节码对象
        //======================================================

        /*Class clazz = LazySingleton2.class;
        //2,获取无参构造方法对象
        Constructor cons = clazz.getDeclaredConstructor();
        //3,取消访问检查
        cons.setAccessible(true);
        //4,创建Singleton对象
        LazySingleton2 s1 = (LazySingleton2) cons.newInstance();
        LazySingleton2 s2 = (LazySingleton2) cons.newInstance();

        System.out.println(s1 == s2); //如果返回的是true，说明并没有破坏单例模式，如果是false，说明破坏了单例模式*/
        //============================================================
        //writeObject2File();
        /*readObjectFromFile();*/
        readObjectFromFile();

    }



    public static void readObjectFromFile() throws Exception {
        //1,创建对象输入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\123\\a.txt"));
        //2,读取对象
        LazySingleton2 instance = (LazySingleton2) ois.readObject();

        System.out.println(instance);

        //释放资源
        ois.close();
    }

    //向文件中写数据（对象）
    public static void writeObject2File() throws Exception {
        //1,获取Singleton对象
        LazySingleton2 instance = LazySingleton2.getInstance();
        //2,创建对象输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\123\\a.txt"));
        //3,写对象
        oos.writeObject(instance);
        //4,释放资源
        oos.close();
    }
}
