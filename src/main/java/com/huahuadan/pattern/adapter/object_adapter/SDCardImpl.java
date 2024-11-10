package com.huahuadan.pattern.adapter.object_adapter;

public class SDCardImpl implements SDCard {

    public String readSD() {
        String msg = "SDCard read msg ： hello word SD";
        return msg;
    }

    public void writeSD(String msg) {
        System.out.println("SDCard write msg ：" + msg);
    }
}
