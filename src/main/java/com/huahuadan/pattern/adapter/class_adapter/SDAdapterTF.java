package com.huahuadan.pattern.adapter.class_adapter;

//适配器模式用于将一个类的接口转换成客户端期望的另一个接口，以便两个不兼容的接口可以一起工作。这里的SDAdapterTF类适配了TFCardImpl，
// 使其可以以SDCard接口的形式被使用，从而实现了TFCard到SDCard的适配。
public class SDAdapterTF extends TFCardImpl implements SDCard {

    public String readSD() {
        System.out.println("adapter read tf card");
        return readTF();
    }

    public void writeSD(String msg) {
        System.out.println("adapter write tf card");
        writeTF(msg);
    }
}
