package com.solid.openclose;

public class Main {
    public static void main(String[] args) {
        Shape rectangleShape = new Rectangle(2,3);
        System.out.println(rectangleShape.area());
    }
}
