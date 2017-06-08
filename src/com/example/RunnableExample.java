package com.example;

/**
 * Created by Гунга on 08.06.2017.
 */
public class RunnableExample {

    public static void main(String[] args) {
        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Printed inside Runnable");
            }
        });

        Thread myLambdaThread = new Thread(() -> System.out.println("Printed inside Lambda Runnable"));

        myThread.run();
        myLambdaThread.run();
    }
}
