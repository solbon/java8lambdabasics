package com.example.unit3;

import com.example.unit1.Person;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Solbon on 2017-06-19.
 */
public class CollectionIterationExample {
    public static List<Person> people = Arrays.asList(
            new Person("Charles", "Dickens", 60),
            new Person("Lewis", "Carrol", 42),
            new Person("Thomas", "Carlyle", 51),
            new Person("Charlotte", "Bronte", 45),
            new Person("Matthew", "Arnold", 39)
    );

    public static void main(String[] args) {
        System.out.println("Using for loop");
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i));
        }
        System.out.println("Using for each loop");
        for (Person p : people) {
            System.out.println(p);
        }
        System.out.println("Using lambda loop");
        people.forEach(System.out::println);
    }
}
