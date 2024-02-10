package com.solid.openclose;

public class Rectangle extends Shape {
    private double length;
    private double berth;

    public Rectangle(double length, double berth) {
        this.length = length;
        this.berth = berth;
    }

    @Override
    public double area() {
        return length*berth;
    }
}
