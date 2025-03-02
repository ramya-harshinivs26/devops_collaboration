package com.example;

public class MainJ {
    public String greet() {
        return "Hello, Jenkins!"; 
    }

    public static void main(String[] args) {
        System.out.println(new MainJ().greet()); 
    }
}
