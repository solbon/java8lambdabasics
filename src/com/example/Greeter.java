package com.example;

/**
 * Created by Гунга on 07.06.2017.
 */
public class Greeter {

    public void greet(Greeting greeting) {
        greeting.perform();
    }
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        greeter.greet(new HelloWorldGreeting());
    }
}
