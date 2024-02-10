package com.solid.dependencying;

public class Main {
    public static void main(String[] args) {

        PasswordService passwordService = new PasswordService(new MongoDatabase());

    }
}
