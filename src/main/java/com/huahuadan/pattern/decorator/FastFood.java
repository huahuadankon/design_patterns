package com.huahuadan.pattern.decorator;

/**
 * 快餐抽象类
 */
public abstract class FastFood {

    private float price;//价格
    private String desc; //描述

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public FastFood(float price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    public FastFood() {
    }

    public abstract float cost();
}
