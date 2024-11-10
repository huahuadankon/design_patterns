package com.huahuadan.pattern.adapter.class_adapter;


public interface TFCard {

    //从TF卡中读取数据
    String readTF();
    //往TF卡中写数据
    void writeTF(String msg);
}
