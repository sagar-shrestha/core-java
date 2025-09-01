package org.example;

import java.util.stream.Stream;

public class StreamApiStreamOfExample {

    public static void main(String[] args) {

        Stream.of(1, 2, 3, 4, 5)
                .forEach(integer -> System.out.println(integer));
    }
}
