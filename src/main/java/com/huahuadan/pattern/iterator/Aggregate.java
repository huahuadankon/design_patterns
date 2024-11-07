package com.huahuadan.pattern.iterator;
//声明集合接口
public interface Aggregate<E> {
     Iterator iterator();
     E getByIndex(int index);
     void add(E element);
     int size();
}
