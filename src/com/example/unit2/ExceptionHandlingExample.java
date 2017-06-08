package com.example.unit2;

import java.util.function.BiConsumer;

/**
 * Created by Гунга on 08.06.2017.
 */
public class ExceptionHandlingExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};
        int key = 0;
        process(numbers, key, wrappedLambda((v, k) -> System.out.println(v / k)));
    }

    private static void process(int[] numbers, int key, BiConsumer<Integer, Integer> consumer) {
        for (int i : numbers) {
            consumer.accept(i, key);
        }
    }

    private static BiConsumer<Integer, Integer> wrappedLambda(BiConsumer<Integer, Integer> consumer) {
        return (v, k) -> {
            try {
                consumer.accept(v, k);
            } catch (ArithmeticException ex) {
                System.out.println("Arithmetic exception caught in wrapped lambda");
            }
        };
    }
}
