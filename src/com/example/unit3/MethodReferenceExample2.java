package com.example.unit3;

import com.example.unit1.Person;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import static com.example.unit1.Unit1Exercise.people;

/**
 * Created by Solbon on 2017-06-19.
 */
public class MethodReferenceExample2 {
    public static void main(String[] args) {
        System.out.println("Printing all persons");
//        printConditionally(people, p -> true, p -> System.out.println(p));
        printConditionally(people, p -> true, System.out::println); // p -> method(p)
    }

    public static void printConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
        for (Person p : people) {
            if (predicate.test(p))
                consumer.accept(p);
        }
        System.out.println();
    }

}
