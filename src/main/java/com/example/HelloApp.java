package com.example;

public class HelloApp {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            StringBuilder greeting = new StringBuilder("Hello, ");
            int count = 0;
            for (String name : args) {
                greeting.append(name);
                count++;
                if (count < args.length) {
                    greeting.append(", ");
                }
            }
            greeting.append("!");
            System.out.println(greeting);
        }
    }
}