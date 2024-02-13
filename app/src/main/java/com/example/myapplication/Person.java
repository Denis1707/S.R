package com.example.myapplication;


public class Person {
    private String name;
    private int id;
    private String phoneNumber;

    public Person(String name, int id, String phoneNumber) {
        this.name = name;
        this.id = id;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}