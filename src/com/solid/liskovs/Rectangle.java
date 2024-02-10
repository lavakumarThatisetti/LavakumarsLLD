package com.solid.liskovs;

public class Rectangle {
    private double length;
    private double berth;

    public Rectangle(double length, double berth) {
        this.length = length;
        this.berth = berth;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBerth() {
        return berth;
    }

    public void setBerth(double berth) {
        this.berth = berth;
    }

    public double area() {
        return length*berth;
    }
}
