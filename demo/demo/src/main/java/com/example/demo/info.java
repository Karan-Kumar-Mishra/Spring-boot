package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class info {

    public User get() {
        return new User("John", 30);
    }
}

class User {
    private String name;
    private int age;

    // Constructor, Getters & Setters required
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}