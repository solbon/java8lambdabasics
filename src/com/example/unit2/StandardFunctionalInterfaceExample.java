package com.example.unit2;

import com.example.unit1.Person;
import com.example.unit1.Unit1Exercise;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

import static com.example.unit1.Unit1Exercise.people;

/**
 * Created by Гунга on 08.06.2017.
 */
public class StandardFunctionalInterfaceExample {
    public static void main(String[] args) {

        // Step 1: Sort list by last name
        Collections.sort(Unit1Exercise.people, Comparator.comparing(Person::getLastName));

        // Step 2: Create a method that prints all elements in the list
        printConditionally(Unit1Exercise.people, person -> true);

        // Step 3: Create a method that prints all people that have last name beginning with C
        printConditionally(Unit1Exercise.people, p -> p.getLastName().startsWith("C"));
        printConditionally(Unit1Exercise.people, p -> p.getFirstName().startsWith("C"));
    }

    public static void printConditionally(List<Person> people, Predicate<Person> predicate) {
        System.out.println("Printing all people with condition");
        for (Person p : people) {
            if (predicate.test(p))
                System.out.println(p);
        }
        System.out.println();
    }
}


