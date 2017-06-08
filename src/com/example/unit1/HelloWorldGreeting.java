package com.example.unit1;

/**
 * Created by Гунга on 07.06.2017.
 */
public class HelloWorldGreeting implements Greeting {


    @Override
    public void perform() {
        System.out.println("Hello world!");
    }
}
