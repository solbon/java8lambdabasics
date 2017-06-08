package com.example.unit2;

import java.util.function.BiConsumer;

/**
 * Created by Гунга on 08.06.2017.
 */
public class ExceptionHandlingExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};
        int key = 0;
        process(numbers, key, (v, k) -> {
            try {
                System.out.println(v / k);
            } catch (ArithmeticException ex) {
                System.out.println("An arithmetic exception handled");
            }
        });

    }

    private static void process(int[] numbers, int key, BiConsumer<Integer, Integer> consumer) {
        for (int i : numbers) {
            consumer.accept(i, key);
        }
    }
}
