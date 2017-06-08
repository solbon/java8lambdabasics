package com.example.unit1;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Гунга on 08.06.2017.
 */
public class Unit1ExerciseSolutionJava7 {
    public static void main(String[] args) {

        // Step 1: Sort list by last name
        Collections.sort(Unit1Exercise.people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getLastName().compareTo(p2.getLastName());
            }
        });

        // Step 2: Create a method that prints all elements in the list
        printAll(Unit1Exercise.people);

        // Step 3: Create a method that prints all people that have last name beginning with C
        printConditionally(Unit1Exercise.people, new Condition() {
            @Override
            public boolean test(Person p) {
                if (p.getLastName().startsWith("C"))
                    return true;
                return false;
            }
        });
        printConditionally(Unit1Exercise.people, new Condition() {
            @Override
            public boolean test(Person p) {
                return p.getFirstName().startsWith("C");
            }
        });

    }

    public static void printAll(List<Person> people) {
        System.out.println("Printing all people");
        for (Person p : people) {
            System.out.println(p);
        }
        System.out.println();
    }

    public static void printConditionally(List<Person> people, Condition condition) {
        System.out.println("Printing all people with condition");
        for (Person p : people) {
            if (condition.test(p))
                System.out.println(p);
        }
        System.out.println();
    }

}

interface Condition {
    boolean test(Person p);
}
