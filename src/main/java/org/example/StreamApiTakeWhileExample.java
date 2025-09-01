package org.example;

import java.util.stream.Stream;

public class StreamApiTakeWhileExample {

    public static void main(String[] args) {
        /*
        takeWhile(): this method is lije filter() method is also takes predicate method.
        It is short circuit stateful intermediate operation.
        This method terminates the stream if the condition does not match the condition.

        Short Circuit: Short circuiting is mapped or checked the condition and if the condition does not match
        then the stream of data breaks and stops the iteration or process or terminating the pipeline.
         */

        Stream.of(1,2,3,4,5,6,7,8,9)
                .takeWhile(number -> number < 7)
                .forEach(System.out::println);

        Stream.of("sagar", "ritu", "susmita", "kundan", "om", "ramaika", "shreesha")
                .takeWhile(name -> name.length() > 2)
                .forEach(System.out::println);


        /*
        Why takeWhile() method is stateful?
        to deal with parallel stream till now we are dealing with sequential stream
         */
    }
}
