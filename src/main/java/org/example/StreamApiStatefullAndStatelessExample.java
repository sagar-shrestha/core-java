package org.example;

import java.util.stream.Stream;

public class StreamApiStatefullAndStatelessExample {

    public static void main(String[] args) {

        /*
        Stateful and stateless operations in streams

        Sorted: Stateful intermediate function

        Stateful operation: stateful operation remembers or get hte streams of data to method like sorted(), distinct()
        method and then sort.

        Basically stateful intermediate function or operation divides streams into two parts
         */
        // sorted is stateful intermediate operations
        Stream.of(10,4,5,2,9,1,8,6,7)
                .sorted()
                .forEach(System.out::println);

        Stream.of("sagar", "suman", "abhi", "ritu", "kundan")
                .filter(str -> {
                    System.out.println("filter for the name : " + str);
                    return str.length() > 3;
                })
                .sorted()
                .peek(nameString -> System.out.println("sorted name: "  + nameString))
                .forEach(System.out::println);
    }
}
