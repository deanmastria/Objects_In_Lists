package org.example;

public class Animal {
    private String name;
    private boolean isDog;

    // Constructor
    public Animal(String name, boolean isDog) {
        this.name = name;
        this.isDog = isDog;
    }

    // Overloaded constructor
    public Animal(String name) {
        this.name = name;
        this.isDog = false; // default value
    }

    // Getters
    public String getName() {
        return name;
    }

    public boolean isDog() {
        return isDog;
    }

    // toString method
    @Override
    public String toString() {
        return "Animal: " + name + " | This a dog? " + isDog;
    }
}


