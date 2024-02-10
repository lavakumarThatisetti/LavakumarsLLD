package com.solid.dependencying;

public class PasswordService {

    Database database;

    public PasswordService(Database database){
        this.database = database;
    }

    public void storePassword(){
        database.store();
    }
}
