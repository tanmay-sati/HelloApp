package com.example;

public class HelloApp {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // Use String.join() to concatenate all names with ", "
            String names = String.join(", ", args);
            System.out.println("Hello, " + names + "!");
        }
    }
}