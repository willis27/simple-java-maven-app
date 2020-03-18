package com.mycompany.app;

/**
 * Simple greeting app
 */
public class App
{

    private final String message = "Hello, message from simple greeting app!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
