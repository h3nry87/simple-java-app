package com.mycompany.app;

/**
 * Hello world!
 */
public class App {

    private static final String MESSAGE = "I really hate Jenkins";

    public App() {}

    public static void main(String[] args) {
        System.out.println("Jenkins is fantastic, testing latest change !");
    }

    public String getMessage() {
        return MESSAGE;
    }
}
