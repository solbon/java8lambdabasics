package com.example;

import java.util.function.Function;

/**
 * Created by Гунга on 07.06.2017.
 */
public class Greeter {

    public void greet(Greeting greeting) {
        greeting.perform();
    }
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        Greeting lambdaGreeting = () -> System.out.println("Hello world!");
        Greeting innerClassGreeting = new Greeting() {
            @Override
            public void perform() {
                System.out.println("Hello world!");
            }
        };
        greeter.greet(lambdaGreeting);
        greeter.greet(innerClassGreeting);
    }
}
