package com.huahuadan.pattern.observer;

/**
 * @author liuyichen
 * @version 1.0
 * @date 2024/11/9 16:48
 * @description 观察者接口
 */
public interface Observer {
    void update(String stockName, double price);
}
