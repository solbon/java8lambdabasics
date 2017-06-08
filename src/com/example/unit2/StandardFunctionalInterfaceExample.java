package com.example.unit2;

import com.example.unit1.Person;
import com.example.unit1.Unit1Exercise;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import static com.example.unit1.Unit1Exercise.people;

/**
 * Created by Гунга on 08.06.2017.
 */
public class StandardFunctionalInterfaceExample {
    public static void main(String[] args) {

        // Step 1: Sort list by last name
        Collections.sort(people, Comparator.comparing(Person::getLastName));

        // Step 2: Create a method that prints all elements in the list
        printConditionally(people, p -> true, p -> System.out.println(p));

        // Step 3: Create a method that prints all people that have last name beginning with C
        printConditionally(people, p -> p.getLastName().startsWith("C"), p -> System.out.println(p));
        printConditionally(people, p -> p.getFirstName().startsWith("C"), p -> System.out.println(p.getFirstName()));
    }

    public static void printConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
        System.out.println("Printing all people with condition");
        for (Person p : people) {
            if (predicate.test(p))
                consumer.accept(p);
        }
        System.out.println();
    }
}


