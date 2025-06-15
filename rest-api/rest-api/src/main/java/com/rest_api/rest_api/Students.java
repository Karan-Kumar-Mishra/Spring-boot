package com.rest_api.rest_api;

public class Students {
    private String name;
    private int age;

    // Default constructor (required for Jackson)
    public Students() {
    }

    // Parameterized constructor (optional)
    public Students(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters and setters (required for Jackson)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}