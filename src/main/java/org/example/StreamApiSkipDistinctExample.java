package org.example;

import java.util.stream.Stream;

public class StreamApiSkipDistinctExample {

    public static void main(String[] args) {
        Stream.of("sagar", "ritu", "susmita", "kundan", "om", "ramaika", "shreesha")
                .skip(2)
                .forEach(System.out::println);
        Stream.of("sagar", "ritu", "susmita", "kundan", "om", "ramaika", "shreesha", "sagar", "ritu",
                        "susmita", "kundan", "om", "ramaika", "shreesha")
                .distinct()
                .forEach(System.out::println);
    }
}
