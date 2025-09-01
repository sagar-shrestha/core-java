package org.example;

import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamApiGenerateExample {

    public static void main(String[] args) {

        /*
        What stream does?
        Stream groups  data and breaks down one by one
         */

        Supplier<String> supplier = new Supplier<String>() {
            @Override
            public String get() {
                return "Hello World!";
            }
        };

        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("Consumer: " + s);
            }
        };

        Stream<String> streamOfString = Stream.generate(supplier);
        streamOfString.forEach(consumer);


        // using stream and setting to one line code

        Stream.generate(() -> "hello world").forEach(strObj -> System.out.println(strObj));
    }
}
