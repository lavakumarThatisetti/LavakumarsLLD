package com.solid.liskovs;

public class Main {
    public static void main(String[] args) {
        // Violating LS
        Square square = new Square(2, 3);
    }
}
