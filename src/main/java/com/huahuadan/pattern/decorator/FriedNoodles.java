package com.huahuadan.pattern.decorator;

/**
 * 具体快餐
 */
public class FriedNoodles extends FastFood {

    public FriedNoodles() {
        super(12,"炒面");
    }

    public float cost() {
        return getPrice();
    }
}
