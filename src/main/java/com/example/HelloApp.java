package com.example;

public class HelloApp {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            StringBuilder greeting = new StringBuilder("Hello, ");
            for (int i = 0; i < args.length; i++) {
                greeting.append(args[i]);
                if (i != args.length - 1) {
                    greeting.append(", ");
                }
            }
            greeting.append("!");
            System.out.println(greeting);
        }
    }
}