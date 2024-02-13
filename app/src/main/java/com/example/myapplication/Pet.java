package com.example.myapplication;

public class Pet {
    private String name;
    private String breed;
    private int imageResourceId;

    public Pet(String name, String breed, int imageResourceId) {
        this.name = name;
        this.breed = breed;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}