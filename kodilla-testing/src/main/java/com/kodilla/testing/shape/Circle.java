package com.kodilla.testing.shape;

public class Circle implements Shape{
    double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public String getShapeName() {
        return "Circle";
    }
    @Override
    public double getField() {
        return 3.14*r*r;
    }
    @Override
    public String toString() {
        return getShapeName() + " " + getField();
    }
}
