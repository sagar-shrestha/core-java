package org.example;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamApiFilterExample {

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Stream<Integer> streamOfIntegers = Arrays.stream(numbers);

        Stream<Integer> filteredIntegerStream = streamOfIntegers.filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer >= 5;
            }
        });
/*
Stream is immutable.

The elements in streams are getting processed one by one.
 */
        // in lambda
        Stream<Integer> filteredIntegerStreamInLambda = streamOfIntegers.filter(integer -> integer >= 5);

        filteredIntegerStreamInLambda.forEach(System.out::println);

        filteredIntegerStream.forEach(filteredValue -> System.out.println(filteredValue));
    }
}
