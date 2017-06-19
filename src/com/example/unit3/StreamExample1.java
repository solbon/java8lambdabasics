package com.example.unit3;

import static com.example.unit1.Unit1Exercise.people;

/**
 * Created by Solbon on 2017-06-19.
 */
public class StreamExample1 {
    public static void main(String[] args) {
        people.stream()
                .filter(p -> p.getLastName().startsWith("C"))
                .forEach(p -> System.out.println(p.getFirstName() + " " + p.getLastName()));
    }
}
