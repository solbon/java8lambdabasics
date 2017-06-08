package com.example.unit1;

/**
 * Created by Гунга on 08.06.2017.
 */
public class TypeInferenceExample {

    public static void main(String[] args) {
        printLambda(s -> s.length());
    }

    public static void printLambda(StringLengthLambda l) {
        System.out.println(l.getLength("Hello Lambda"));
    }

    interface StringLengthLambda {
        int getLength(String s);
    }

}
