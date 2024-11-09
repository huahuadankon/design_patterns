package com.huahuadan.pattern.observer;

/**
 * @author liuyichen
 * @version 1.0
 * @date 2024/11/9 16:50
 * @description 被观察者接口
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
