package com.huahuadan.principles.richtersubstitution;


public class Square implements Quadrilateral {

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getLength() {
        return side;
    }

    public double getWidth() {
        return side;
    }
}
