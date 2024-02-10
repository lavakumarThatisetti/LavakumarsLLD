package com.solid.liskovs;


public class Square extends Rectangle {
    private double side;

    public Square(double length, double berth) {
        super(length, berth);
    }

    @Override
    public double area() {
        return super.area();
    }
}
