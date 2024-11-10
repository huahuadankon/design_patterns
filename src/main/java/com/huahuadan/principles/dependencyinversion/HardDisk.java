package com.huahuadan.principles.dependencyinversion;


public interface HardDisk {

    //存储数据
    public void save(String data);

    //获取数据
    public String get();
}
