package com.example.unit3;

/**
 * Created by Solbon on 2017-06-19.
 */
public class MethodReferenceExample1 {
    public static void main(String[] args) {
//        Thread t = new Thread(() -> printMessage());
        Thread t = new Thread(MethodReferenceExample1::printMessage);
        t.start();
    }

    public static void printMessage() {
        System.out.println("Hello");
    }
}
